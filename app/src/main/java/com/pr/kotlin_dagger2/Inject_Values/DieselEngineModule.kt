package com.pr.kotlin_dagger2.Inject_Values

import dagger.Module
import dagger.Provides



@Module
class DieselEngineModule constructor(
    var horsepower:Int
) {

    val TAG="PR7"

    @Provides
    fun provideDengine():DieselEngine{
        return DieselEngine(horsepower)
    }
}