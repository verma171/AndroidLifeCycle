package com.learn.lifecyclesample

import android.text.TextUtils
import android.util.Log
import androidx.fragment.app.Fragment

/**
 * Lifecycle monitoring utility
 */
object Util {
    fun recLifeCycle(callingClass: Class<*>, state: LifecycleState?) {
        val note = when (state) {
            LifecycleState.CALL_TO_SUPER -> "→☐"
            LifecycleState.RETURN_FROM_SUPER -> "☐→"
            else -> null
        }
        recLifeCycle(callingClass, note)
    }

    private fun recLifeCycle(callingClass: Class<*>, note: String?) {
        val className = callingClass.simpleName
        val s = Thread.currentThread().stackTrace
        val methodName = s[4].methodName

        Log.i(
            "LifecycleLog",
            className + "." + methodName + (if (TextUtils.isEmpty(note)) "" else " / $note")
        )
    }

    enum class LifecycleState {
        CALL_TO_SUPER,
        RETURN_FROM_SUPER
    }
}
