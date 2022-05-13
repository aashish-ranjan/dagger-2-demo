package com.aashish.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aashish.dagger2demo.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = (application as DaggerDemoApplication).appComponent
            .getActivityComponentBuilder()
            .horsePower(111)
            .capacity(1122)
            .bld()

        carComponent.inject(this)
        car.drive()
        car2.drive()
    }
}