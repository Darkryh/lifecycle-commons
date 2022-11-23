package com.ead.commons.lib.lifecycle.activity

import android.app.Activity
import android.widget.Toast


fun Activity.showLongToast(string: String) =
    Toast.makeText(this,string, Toast.LENGTH_LONG).show()


fun Activity.showShortToast(string: String) =
    Toast.makeText(this,string, Toast.LENGTH_SHORT).show()