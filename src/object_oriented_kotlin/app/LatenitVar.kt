package object_oriented_kotlin.app

import object_oriented_kotlin.data.Television

fun main() {
    val tv = Television()
    tv.brand = "Samsul"
    println(tv.brand)

    tv.initTV("Aquos")
    println(tv.brand)
}