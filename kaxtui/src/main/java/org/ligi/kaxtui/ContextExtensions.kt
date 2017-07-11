package org.ligi.kaxtui

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.support.annotation.StringRes

fun Context.alert(message: String, title: String? = null, onOKListener: DialogInterface.OnClickListener? = null) {
    val builder = AlertDialog.Builder(this).setMessage(message)
    title?.let {
        builder.setTitle(it)
    }
    builder.setPositiveButton(android.R.string.ok, onOKListener)
    builder.show()
}


fun Context.alert(@StringRes message: Int, @StringRes title: Int? = null, onOKListener: DialogInterface.OnClickListener? = null) {
    val builder = AlertDialog.Builder(this).setMessage(message)
    title?.let {
        builder.setTitle(it)
    }
    builder.setPositiveButton(android.R.string.ok, onOKListener)
    builder.show()
}