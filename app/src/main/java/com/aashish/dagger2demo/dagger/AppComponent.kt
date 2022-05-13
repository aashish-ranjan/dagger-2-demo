package com.aashish.dagger2demo.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponentFactory(): ActivityComponent.Fctry

    @Component.Factory
    interface Faktory {
        fun kreate(driverModule: DriverModule): AppComponent
    }
}