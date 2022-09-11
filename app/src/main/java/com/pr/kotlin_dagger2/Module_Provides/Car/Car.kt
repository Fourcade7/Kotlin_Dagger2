package com.pr.kotlin_dagger2.Module_Provides.Car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    val wheels: Wheels,
    val engine: Engine
) {

    val TAG="PR7"
    
    fun drive(){
        Log.d(TAG, "drive: ...")
    }
}