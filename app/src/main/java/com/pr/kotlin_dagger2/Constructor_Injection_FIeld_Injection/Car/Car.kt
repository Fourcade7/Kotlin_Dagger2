package com.pr.kotlin_dagger2.Constructor_Injection_FIeld_Injection.Car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val engine: Engine,
    val wheels: Wheels
) {
    
    val TAG="PR7"
    
    fun drive(){
        Log.d(TAG, "drive: ")
    }
}