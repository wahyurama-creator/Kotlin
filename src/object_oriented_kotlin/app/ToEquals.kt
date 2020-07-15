package object_oriented_kotlin.app

import object_oriented_kotlin.data.Company

fun main() {
    val equal = Company(1)
    val equal1 = Company(1)

    println(equal == equal1)

    println(equal.hashCode() == equal1.hashCode())
}