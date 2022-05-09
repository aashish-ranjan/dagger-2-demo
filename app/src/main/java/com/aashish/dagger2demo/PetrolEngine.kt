package com.aashish.dagger2demo

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    companion object {
        private const val TAG = "Petrol"
    }
    override fun start() {
        Log.d(TAG, "Petrol Engine started")
    }
}