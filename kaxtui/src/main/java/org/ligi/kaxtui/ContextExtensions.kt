package org.ligi.kaxtui

import android.app.AlertDialog
import android.content.Context

fun Context.alert(message: String, title: String? = null) {
    val builder = AlertDialog.Builder(this).setMessage(message)
    title?.let {
        builder.setTitle(it)
    }
    builder.setPositiveButton(android.R.string.ok, null)
    builder.show()
}


fun Context.alert(message: Int, title: Int? = null) {
    val builder = AlertDialog.Builder(this).setMessage(message)
    title?.let {
        builder.setTitle(it)
    }
    builder.setPositiveButton(android.R.string.ok, null)
    builder.show()
}