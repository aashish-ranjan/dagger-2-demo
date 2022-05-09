package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.car.Engine
import com.aashish.dagger2demo.car.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providesEngine(): Engine {
        return PetrolEngine()
    }
}