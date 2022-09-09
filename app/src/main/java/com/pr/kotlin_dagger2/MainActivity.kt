package com.pr.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr.kotlin_dagger2.Constructor_Injection_FIeld_Injection.Car.Car
import com.pr.kotlin_dagger2.Constructor_Injection_FIeld_Injection.Car.Wheels
import com.pr.kotlin_dagger2.Constructor_Injection_FIeld_Injection.Dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var wheels: Wheels

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component= DaggerCarComponent.create()
        component.inject(this)



    }
}