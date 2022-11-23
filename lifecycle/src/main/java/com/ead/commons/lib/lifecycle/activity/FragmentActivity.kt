package com.ead.commons.lib.lifecycle.activity

import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.FragmentActivity


fun FragmentActivity.onBackPressedNow() {
    if(!onBackPressedDispatcher.hasEnabledCallbacks()){
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() { finish() } })
    }
    onBackPressedDispatcher.onBackPressed()
}

fun FragmentActivity.onBackHandle(task: () -> Unit) {
    if(!onBackPressedDispatcher.hasEnabledCallbacks()){
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() { task() } })
    }
}

fun FragmentActivity.onBackHandlePressed() {
    if (onBackPressedDispatcher.hasEnabledCallbacks()) onBackPressedDispatcher.onBackPressed()
}