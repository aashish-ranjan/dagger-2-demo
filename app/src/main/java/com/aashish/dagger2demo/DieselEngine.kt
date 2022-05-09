package com.aashish.dagger2demo

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {
    companion object {
        private const val TAG = "Diesel"
    }
    override fun start() {
        Log.d(TAG, "Diesel Engine started")
    }
}