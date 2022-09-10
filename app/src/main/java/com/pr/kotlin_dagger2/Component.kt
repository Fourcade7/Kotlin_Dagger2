package com.pr.kotlin_dagger2

import com.pr.kotlin_dagger2.Constructor_Injection_and_Field_Injection.Car
import com.pr.kotlin_dagger2.MainActivity
import com.pr.kotlin_dagger2.Module_Provides.Google.GoogleModule
import dagger.Component


@Component(modules = [GoogleModule::class])
interface Component {

    fun getCar():Car

    fun inject(mainActivity: MainActivity)


}