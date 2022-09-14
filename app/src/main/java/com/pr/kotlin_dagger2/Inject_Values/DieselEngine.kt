package com.pr.kotlin_dagger2.Inject_Values

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(
    var horsepower:Int
) {
    val TAG="PR7"

    @Inject
    fun startdien(){
        Log.d(TAG, "startdien: diesel engine started... horsepower=$horsepower")
    }
}