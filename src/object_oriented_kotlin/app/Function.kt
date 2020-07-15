package object_oriented_kotlin.app

import object_oriented_kotlin.data.Person

fun main() {
    val name = Person()
    name.firstName = "Wahyu"
    name.lastName = "rama"

    name.lengthName("Wahyu")
    println(name.lengthName("wahyu", "rama"))
}