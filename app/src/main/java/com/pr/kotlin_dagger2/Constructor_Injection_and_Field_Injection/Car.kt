package com.pr.kotlin_dagger2.Constructor_Injection_and_Field_Injection

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {
    
    val TAG="PR7"

    @Inject
    fun drive(){
        Log.d(TAG, "drive: ")
        println("prln drive... ")
       // wheels.wheelsconnected()
    }
}