package com.aashish.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.create()
        car = carComponent.getCar()
        car.drive()
    }
}