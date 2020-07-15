package object_oriented_kotlin.app

import object_oriented_kotlin.data.Fruit

fun main() {
    val fruit1 = Fruit(10) + Fruit(5)
    println(fruit1)

    val fruit2 = Fruit(5) - Fruit(10)
    println(fruit2)
}