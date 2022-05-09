package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.car.DieselEngine
import com.aashish.dagger2demo.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindsEngine(dieselEngine: DieselEngine): Engine
}