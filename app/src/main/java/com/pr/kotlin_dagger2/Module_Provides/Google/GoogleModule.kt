package com.pr.kotlin_dagger2.Module_Provides.Google

import android.util.Log
import dagger.Module
import dagger.Provides


@Module
class GoogleModule {
    val TAG="PR7"

    @Provides
    fun provideYoutube():Youtube{
        val youtube=Youtube()
        youtube.playvideo()
        return youtube
    }

    @Provides
    fun provideFirebase():Firebase{

        val firebase=Firebase()
        firebase.connect()
        return firebase
    }


    @Provides
    fun chrome():String{
        Log.d(TAG, "chrome: ...")
        return "xaxax pzds"
    }





}