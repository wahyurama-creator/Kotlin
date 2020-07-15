package object_oriented_kotlin.app

import object_oriented_kotlin.data.Person

fun main() {
    val person = Person()
    person.firstName = "wahyu"
    person.lastName = "setyadji"

    println(person.firstName)
    println(person.lastName)
}