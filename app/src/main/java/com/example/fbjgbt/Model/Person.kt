package com.example.fbjgbt.Model

import android.R

class Person(var name: String, var age: String, var photoId: Int)

//private val persons: MutableList<Person>? = null
var persons = arrayListOf<Person>()
// This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
fun initializeData() {
    persons = ArrayList()
    persons.add(Person("Emma Wilson", "23 years old", 1))
    persons.add(Person("Lavery Maiss", "25 years old",2))
    persons.add(Person("Lillie Watts", "35 years old", 3))
}