package com.ead.commons.lib.lifecycle.fragment

import android.widget.Toast
import androidx.fragment.app.Fragment


fun Fragment.showLongToast(string: String) =
    Toast.makeText(requireContext(),string, Toast.LENGTH_LONG).show()

fun Fragment.showShortToast(string: String) =
    Toast.makeText(requireContext(),string, Toast.LENGTH_SHORT).show()