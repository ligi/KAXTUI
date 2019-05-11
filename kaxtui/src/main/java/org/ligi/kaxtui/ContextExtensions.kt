package org.ligi.kaxtui

import android.content.Context
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog

fun Context.alert(message: String,
                  title: String? = null,
                  onCancel: (() -> Unit)? = null,
                  onOK: () -> Unit = {}) {
    val builder = AlertDialog.Builder(this).setMessage(message)
    title?.let {
        builder.setTitle(it)
    }
    builder.setPositiveButton(android.R.string.ok) { _, _ -> onOK() }
    builder.setOnCancelListener { if (onCancel != null) onCancel() else onOK() }
    builder.show()
}


fun Context.alert(@StringRes message: Int,
                  @StringRes title: Int? = null,
                  onCancel: (() -> Unit)? = {},
                  onOK: () -> Unit = {}) {
    val builder = AlertDialog.Builder(this).setMessage(message)
    title?.let {
        builder.setTitle(it)
    }
    builder.setPositiveButton(android.R.string.ok) { _, _ -> onOK() }
    builder.setOnCancelListener {
        if (onCancel != null) onCancel() else onOK()
    }
    builder.show()
}