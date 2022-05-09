package com.aashish.dagger2demo

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindsEngine(dieselEngine: DieselEngine): Engine
}