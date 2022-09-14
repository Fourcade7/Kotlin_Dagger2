package com.pr.kotlin_dagger2.Binds

import dagger.Module
import dagger.Provides


@Module
class WheelsModule {


    @Provides
    fun provideRims():Rims{
        val rims=Rims()
        rims.myrims()

        return rims
    }

    @Provides
    fun provideTires():Tires{
        val tires=Tires()
        tires.mytires()
        return tires
    }

}