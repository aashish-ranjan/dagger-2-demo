package com.aashish.dagger2demo

import dagger.Component

@Component (modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}