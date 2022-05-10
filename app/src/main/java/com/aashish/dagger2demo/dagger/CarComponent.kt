package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(horsepower: Int): Builder

        fun build(): CarComponent
    }
}