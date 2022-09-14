package com.pr.kotlin_dagger2.Named

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class CatModule {

    @Provides
    @Named("Masha")
    fun masha():Cat{
        return Cat("Masha7")
    }

    @Provides
    @Named("Garfield")
    fun garfield():Cat{
        return Cat("Garfield8")
    }


}