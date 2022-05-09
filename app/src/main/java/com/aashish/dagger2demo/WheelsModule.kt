package com.aashish.dagger2demo

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun providesRim(): Rim {
        return Rim()
    }

    @Provides
    fun providesType(): Tyre {
        return Tyre().apply {
            inflate()
        }
    }

    @Provides
    fun providesWheel(rim: Rim, tyre: Tyre): Wheels {
        return Wheels(rim, tyre)
    }
}