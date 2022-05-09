package com.aashish.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aashish.dagger2demo.car.Car
import com.aashish.dagger2demo.dagger.DaggerCarComponent
import com.aashish.dagger2demo.dagger.PetrolEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.builder()
            .petrolEngineModule(PetrolEngineModule(100))
            .build()
        carComponent.inject(this)
        car.drive()
    }
}