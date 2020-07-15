package object_oriented_kotlin.app

import object_oriented_kotlin.data.Laptop

fun main() {
    val laptop = Laptop("ASUS")
    println(laptop.name.toString())
    println(laptop.name.hashCode())
}