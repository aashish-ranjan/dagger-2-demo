package com.aashish.dagger2demo

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}