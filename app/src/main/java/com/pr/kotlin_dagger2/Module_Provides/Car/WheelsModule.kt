package com.pr.kotlin_dagger2.Module_Provides.Car

import dagger.Module
import dagger.Provides


@Module
class WheelsModule {



    @Provides
    fun provideRims(): Rims = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }
    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels = Wheels(rims, tires)
}