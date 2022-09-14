package com.pr.kotlin_dagger2.Binds

import dagger.Binds
import dagger.Module


@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine):Engine
}