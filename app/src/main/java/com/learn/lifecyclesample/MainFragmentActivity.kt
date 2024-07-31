package com.learn.lifecyclesample

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.loader.app.LoaderManager
import com.learn.lifecyclesample.Util.LifecycleState

/**
 * A standard v4 support version of Activity.
 */
class MainFragmentActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onCreate(savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
        setContentView(R.layout.activity_main_compat)

        FragmentManager.enableDebugLogging(true)
        LoaderManager.enableDebugLogging(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onActivityResult(requestCode, resultCode, data)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onAttachedToWindow() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onAttachedToWindow()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onAttachFragment(fragment: Fragment) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onAttachFragment(fragment)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onConfigurationChanged(newConfig)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onContentChanged() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onContentChanged()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onDestroy() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onDestroy()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onDetachedFromWindow() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onDetachedFromWindow()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onNewIntent(intent: Intent) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onNewIntent(intent)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onPause() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onPause()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onPostCreate(savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onPostResume() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onPostResume()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        val result = super.onPrepareOptionsMenu(menu)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)

        return result
    }

    override fun onRestart() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onRestart()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onRestoreInstanceState(savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onResume() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onResume()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onResumeFragments() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onResumeFragments()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onSaveInstanceState(outState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onWindowFocusChanged(hasFocus)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onUserLeaveHint() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onUserLeaveHint()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onStart() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onStart()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onStop() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onStop()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onUserInteraction() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onUserInteraction()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }
}
