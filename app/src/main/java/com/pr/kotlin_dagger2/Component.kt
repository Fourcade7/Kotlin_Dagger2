package com.pr.kotlin_dagger2

import com.pr.kotlin_dagger2.Binds.PetrolEngineModule
import com.pr.kotlin_dagger2.Binds.WheelsModule
import dagger.Component


@Component(modules = [WheelsModule::class,PetrolEngineModule::class])
interface Component {

    fun getCar():com.pr.kotlin_dagger2.Binds.Car

    fun inject(mainActivity: MainActivity)


}