package com.pr.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pr.kotlin_dagger2.Binds.*
import com.pr.kotlin_dagger2.Module_Provides.Car.Car

import com.pr.kotlin_dagger2.Module_Provides.Google.Firebase
import com.pr.kotlin_dagger2.Module_Provides.Google.Google
import com.pr.kotlin_dagger2.Module_Provides.Google.Youtube
import javax.inject.Inject


class MainActivity : AppCompatActivity() {





    @Inject
    lateinit var engine: Engine


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component= DaggerComponent.create()
        component.inject(this)

        engine.start()










    }
}