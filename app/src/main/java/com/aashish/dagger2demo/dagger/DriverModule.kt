package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {

    @Singleton
    @Provides
    fun providesDriver(): Driver {
        return Driver()
    }
}