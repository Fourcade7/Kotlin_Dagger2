package com.pr.kotlin_dagger2.Binds

import javax.inject.Inject

class Wheels @Inject constructor(
    val rims: Rims,
    val tires: Tires
) {
}