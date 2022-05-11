package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [DriverModule::class])
interface AppComponent {
    fun getDriver(): Driver
}