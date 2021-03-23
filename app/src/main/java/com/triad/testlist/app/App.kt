package com.triad.testlist.app

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

class App : Application() {

    init {
        instance = this
    }

    companion object {
        var instance: App? = null
        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        // initialize for any
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}