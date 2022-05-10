package com.aashish.dagger2demo.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val driver: Driver, private val wheels: Wheels) {
    companion object {
        private const val TAG = "Car"
    }

    @Inject
    lateinit var engine: Engine

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver driving car $this")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}