package object_oriented_kotlin.app

import object_oriented_kotlin.data.InheritAnimal

fun main() {
    val inheritAnimal = InheritAnimal()
    inheritAnimal.name = "Kucing"
    println(inheritAnimal.name)
}