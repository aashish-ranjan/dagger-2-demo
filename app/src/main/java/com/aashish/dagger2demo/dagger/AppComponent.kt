package com.aashish.dagger2demo.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponent(): ActivityComponent
}