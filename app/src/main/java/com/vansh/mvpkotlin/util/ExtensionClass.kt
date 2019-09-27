package com.vansh.mvpkotlin.util

import android.content.Context
import android.view.Gravity
import android.widget.Toast

/**
 * Created by Ganesh Junghare on 6/22/2019.
 */

fun String.toast(context: Context, len: Int = Toast.LENGTH_LONG) {
    Toast.makeText(context, this, len).apply {
        setGravity(Gravity.CENTER, 0, 0)
        show()
    }
}