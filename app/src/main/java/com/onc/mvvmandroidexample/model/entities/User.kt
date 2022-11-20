package com.onc.mvvmandroidexample.model.entities

import java.io.Serializable

data class User (
    val name : String,
    val lastName : String,
    val age  :Int
    ): Serializable