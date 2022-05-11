package com.aashish.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aashish.dagger2demo.car.Car
import com.aashish.dagger2demo.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car
    @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerActivityComponent.builder()
            .horsePower(120)
            .capacity(1400)
            .appComponent((application as DaggerDemoApplication).appComponent)
            .build()

        carComponent.inject(this)
        car.drive()
        car2.drive()
    }
}