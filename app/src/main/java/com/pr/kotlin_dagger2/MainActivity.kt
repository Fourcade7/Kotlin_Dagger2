package com.pr.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pr.kotlin_dagger2.Binds.*
import com.pr.kotlin_dagger2.Inject_Values.DieselEngine
import com.pr.kotlin_dagger2.Inject_Values.DieselEngineModule
import com.pr.kotlin_dagger2.Module_Provides.Car.Car

import com.pr.kotlin_dagger2.Module_Provides.Google.Firebase
import com.pr.kotlin_dagger2.Module_Provides.Google.Google
import com.pr.kotlin_dagger2.Module_Provides.Google.Youtube
import com.pr.kotlin_dagger2.Named.Cat
import javax.inject.Inject
import javax.inject.Named


class MainActivity : AppCompatActivity() {




    @Inject
    @field:Named("Masha")
    lateinit var masha: Cat

    @Inject
    @field:Named("Garfield")
    lateinit var garfield: Cat

    val TAG="PR7"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component= DaggerComponent.create()
        component.inject(this)



        Log.d(TAG, "${masha.name}")
        Log.d(TAG, "${garfield.name}")










    }
}