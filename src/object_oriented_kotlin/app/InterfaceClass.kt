package object_oriented_kotlin.app

import object_oriented_kotlin.data.AtenaType
import object_oriented_kotlin.data.LedType

fun main() {
    val typeLed = LedType("STD")
    typeLed.sayLED("SHARP")

    val atenaType = AtenaType(10, "MHz")
    atenaType.sayHz("DoneAll")
    atenaType.sayLED("AQUOS")
}