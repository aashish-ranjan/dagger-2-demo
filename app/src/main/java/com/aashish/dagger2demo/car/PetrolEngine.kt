package com.aashish.dagger2demo.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(private val horsePower: Int) : Engine {
    companion object {
        private const val TAG = "Petrol"
    }
    override fun start() {
        Log.d(TAG, "Petrol Engine started with horsepower $horsePower")
    }
}