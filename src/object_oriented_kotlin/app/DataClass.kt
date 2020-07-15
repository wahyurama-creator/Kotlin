package object_oriented_kotlin.app

import object_oriented_kotlin.data.Product

fun main() {
    val product = Product("Cleaner", 10_000, 5)
    println(product.toString())

    val product2 = product.copy(name = "Noodle", item = 2)
    println(product2)
}