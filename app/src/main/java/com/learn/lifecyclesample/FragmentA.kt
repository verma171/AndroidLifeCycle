package com.learn.lifecyclesample

import android.annotation.TargetApi
import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.learn.lifecyclesample.Util.LifecycleState

class FragmentA : androidx.fragment.app.Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onActivityCreated(savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        val v = inflater.inflate(R.layout.fragment_test, container, false)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onViewCreated(view, savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
        view.findViewById<TextView>(R.id.title).setText(this.javaClass.simpleName)
        view.findViewById<Button>(R.id.replaceFragment).setOnClickListener{
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.container,FragmentB(),FragmentB::class.java.name)
                commit()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onActivityResult(requestCode, resultCode, data)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onConfigurationChanged(newConfig)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onCreate(savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onCreateOptionsMenu(menu, inflater)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onDestroy() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onDestroy()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onDestroyOptionsMenu() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onDestroyOptionsMenu()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onDestroyView() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onDestroyView()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onDetach() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onDetach()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onInflate(activity: Activity, attrs: AttributeSet, savedInstanceState: Bundle?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onInflate(activity, attrs, savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onPause() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onPause()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onPrepareOptionsMenu(menu)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onResume() {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onResume()
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onSaveInstanceState(outState)
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

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Util.recLifeCycle(javaClass, LifecycleState.CALL_TO_SUPER)
        super.onViewStateRestored(savedInstanceState)
        Util.recLifeCycle(javaClass, LifecycleState.RETURN_FROM_SUPER)
    }
}
