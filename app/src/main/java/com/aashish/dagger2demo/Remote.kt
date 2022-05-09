package com.aashish.dagger2demo

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    companion object {
        private const val TAG = "Remote"
    }

    fun setListener(car: Car) {
        Log.d(TAG, "enableRemote: Remote connected")
    }
}