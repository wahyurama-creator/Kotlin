package object_oriented_kotlin.app

import object_oriented_kotlin.data.Person

fun main() {
    val name = Person()
    name.firstName = "Wahyu"
    println(name.fullName("Wahyu Rama"))
}