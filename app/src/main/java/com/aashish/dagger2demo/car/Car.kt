package com.aashish.dagger2demo.car

import android.util.Log
import com.aashish.dagger2demo.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(private val driver: Driver, private val wheels: Wheels) {
    companion object {
        private const val TAG = "Car"
    }

    @Inject
    lateinit var engine: Engine

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver ${driver.getFullName()} driving car $this")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}