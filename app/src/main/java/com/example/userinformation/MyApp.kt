package com.example.userinformation

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class MyApp : Application() {

    val tag: String = "ActivityLifeCycle"



    override fun onCreate() {
        super.onCreate()


        registerActivityLifecycleCallbacks(object  : ActivityLifecycleCallbacks{
            override fun onActivityCreated(act: Activity, p1: Bundle?) {

            }

            override fun onActivityStarted(act: Activity) {
                Log.d(tag, act.javaClass.simpleName + " onStarted")
            }

            override fun onActivityResumed(act: Activity) {
                Log.d(tag, act.javaClass.simpleName + " onResume")
            }

            override fun onActivityPaused(act: Activity) {
                if(act is MainActivity){
                    Toast.makeText(act.applicationContext,"Sayfa Açılıyor",Toast.LENGTH_LONG).show()
                }

            }

            override fun onActivityStopped(act: Activity) {
                Log.d(tag, act.javaClass.simpleName + " onStop")

            }

            override fun onActivitySaveInstanceState(act: Activity, p1: Bundle) {
                Log.d(tag, act.javaClass.simpleName + " onSaveInstance")
            }

            override fun onActivityDestroyed(act: Activity) {
                Log.d(tag, act.javaClass.simpleName + " onDestroy")
            }

        })



    }


}