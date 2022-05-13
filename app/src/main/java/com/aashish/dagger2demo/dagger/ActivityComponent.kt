package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.MainActivity
import dagger.Subcomponent

@PerActivity
@Subcomponent (modules = [WheelsModule::class, DieselEngineModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}