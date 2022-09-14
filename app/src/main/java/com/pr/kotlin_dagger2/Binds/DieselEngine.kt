package com.pr.kotlin_dagger2.Binds

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() :Engine {
    val TAG="PR7"
    override fun start() {

        Log.d(TAG, "start: diesel engine started...")
    }
}