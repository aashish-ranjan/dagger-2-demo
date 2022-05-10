package com.aashish.dagger2demo.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse_power") private val horsePower: Int,
    @Named("capacity") private val capacity: Int) : Engine {
    companion object {
        private const val TAG = "Petrol"
    }
    override fun start() {
        Log.d(TAG, "Petrol Engine started with horsepower $horsePower & capacity $capacity")
    }
}