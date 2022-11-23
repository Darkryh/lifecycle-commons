package com.ead.commons.lib.lifecycle.activity

import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback

fun ComponentActivity.onBack() {
    if(!onBackPressedDispatcher.hasEnabledCallbacks()){
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() { finish() } })
    }
    onBackPressedDispatcher.onBackPressed()
}

fun ComponentActivity.onBackHandle(task: () -> Unit) {
    if(!onBackPressedDispatcher.hasEnabledCallbacks()){
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() { task() } })
    }
}

fun ComponentActivity.onBackHandlePressed() {
    if (onBackPressedDispatcher.hasEnabledCallbacks()) onBackPressedDispatcher.onBackPressed()
}