package com.aashish.dagger2demo

import android.app.Application
import com.aashish.dagger2demo.dagger.ActivityComponent
import com.aashish.dagger2demo.dagger.DaggerActivityComponent

class DaggerDemoApplication: Application() {

    lateinit var activityComponent: ActivityComponent

    override fun onCreate() {
        super.onCreate()
        activityComponent = DaggerActivityComponent.builder()
            .horsePower(100)
            .capacity(1300)
            .build()
    }
}