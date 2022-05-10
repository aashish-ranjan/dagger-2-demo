package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.car.Engine
import com.aashish.dagger2demo.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine): Engine
}