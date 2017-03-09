package org.ligi.kaxtui

import android.app.AlertDialog
import android.content.Context


fun Context.alert(message: String) {
    AlertDialog.Builder(this).setMessage(message)
            .setPositiveButton(android.R.string.ok, null)
            .show()

}