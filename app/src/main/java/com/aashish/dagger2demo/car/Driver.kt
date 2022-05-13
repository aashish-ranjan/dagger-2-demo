package com.aashish.dagger2demo.car

class Driver(private val firstName: String, private val lastName: String) {
    //assume this class comes from a 3rd party lib

    fun getFullName(): String {
        return "$firstName $lastName"
    }
}