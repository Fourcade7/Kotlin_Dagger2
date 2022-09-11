package com.pr.kotlin_dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr.kotlin_dagger2.Module_Provides.Car.Car
import com.pr.kotlin_dagger2.Module_Provides.Google.Firebase
import com.pr.kotlin_dagger2.Module_Provides.Google.Google
import com.pr.kotlin_dagger2.Module_Provides.Google.Youtube
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var car: Car
//    @Inject
//    lateinit var google: Google
    @Inject
    lateinit var firebase: Firebase
    @Inject
    lateinit var youtube: Youtube


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component= DaggerComponent.create()
        component.inject(this)


        //bir narsa yozib





    }
}