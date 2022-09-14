package com.pr.kotlin_dagger2

import com.pr.kotlin_dagger2.Binds.PetrolEngineModule
import com.pr.kotlin_dagger2.Binds.WheelsModule
import com.pr.kotlin_dagger2.Inject_Values.DieselEngineModule
import com.pr.kotlin_dagger2.Named.CatModule
import dagger.Component


@Component(modules = [CatModule::class])
interface Component {

    fun getCar():com.pr.kotlin_dagger2.Binds.Car

    fun inject(mainActivity: MainActivity)


}