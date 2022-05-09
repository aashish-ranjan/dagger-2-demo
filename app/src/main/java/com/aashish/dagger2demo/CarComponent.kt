package com.aashish.dagger2demo

import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponent {
    fun inject(mainActivity: MainActivity)
}