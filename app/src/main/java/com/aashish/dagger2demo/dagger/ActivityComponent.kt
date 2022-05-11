package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
@Component (dependencies = [AppComponent::class], modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse_power") hp: Int): Builder

        @BindsInstance
        fun capacity(@Named("capacity") capacity: Int): Builder

        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ActivityComponent
    }
}