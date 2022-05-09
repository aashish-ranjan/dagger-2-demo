package com.aashish.dagger2demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels) {
    companion object {
        private const val TAG = "Car"
    }

    @Inject
    lateinit var engine: Engine

    fun drive() {
        Log.d(TAG, "driving..")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}