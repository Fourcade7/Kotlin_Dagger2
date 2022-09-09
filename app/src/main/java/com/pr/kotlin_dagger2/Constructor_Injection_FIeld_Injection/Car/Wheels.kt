package com.pr.kotlin_dagger2.Constructor_Injection_FIeld_Injection.Car

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {

    val TAG="PR7"


    @Inject
    fun wheelsconnected(){
        Log.d(TAG, "wheelsconnected: ...777")
    }

}