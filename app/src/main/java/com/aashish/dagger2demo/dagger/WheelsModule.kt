package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.car.Rim
import com.aashish.dagger2demo.car.Tyre
import com.aashish.dagger2demo.car.Wheels
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