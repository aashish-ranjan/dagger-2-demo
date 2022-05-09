package com.aashish.dagger2demo.dagger

import com.aashish.dagger2demo.MainActivity
import dagger.Component

@Component (modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}