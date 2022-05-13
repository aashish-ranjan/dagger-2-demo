package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(private val driverFirstName: String, private val driverLastName: String) {

    @Singleton
    @Provides
    fun providesDriver(): Driver {
        return Driver(driverFirstName, driverLastName)
    }
}