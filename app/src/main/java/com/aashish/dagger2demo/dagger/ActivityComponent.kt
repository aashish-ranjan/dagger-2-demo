package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent (modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Fctry {
        fun kreate(@BindsInstance @Named("horse_power") horsepower: Int,
                   @BindsInstance @Named("capacity") capacity: Int): ActivityComponent
    }


}