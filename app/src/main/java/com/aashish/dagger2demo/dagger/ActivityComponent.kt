package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent (modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Bldr {

        @BindsInstance
        fun horsePower(@Named("horse_power") horsepower: Int): Bldr

        @BindsInstance
        fun capacity(@Named("capacity") capacity: Int): Bldr

        fun bld(): ActivityComponent
    }


}