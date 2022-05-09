package com.aashish.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providesEngine(): Engine {
        return PetrolEngine()
    }
}