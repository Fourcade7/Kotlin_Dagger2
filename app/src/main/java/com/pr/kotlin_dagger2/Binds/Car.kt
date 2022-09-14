package com.pr.kotlin_dagger2.Binds

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(){
    val TAG="PR7"


    @Inject
    fun drive(){
        Log.d(TAG, "drive: pr7")
    }
}