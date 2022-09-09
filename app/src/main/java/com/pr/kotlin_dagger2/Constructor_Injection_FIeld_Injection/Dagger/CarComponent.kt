package com.pr.kotlin_dagger2.Constructor_Injection_FIeld_Injection.Dagger

import com.pr.kotlin_dagger2.Constructor_Injection_FIeld_Injection.Car.Car
import com.pr.kotlin_dagger2.MainActivity
import dagger.Component


@Component
interface CarComponent {

    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

}