package com.aashish.dagger2demo

import android.app.Application
import com.aashish.dagger2demo.dagger.AppComponent
import com.aashish.dagger2demo.dagger.DaggerAppComponent

class DaggerDemoApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}