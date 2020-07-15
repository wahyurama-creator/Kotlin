package object_oriented_kotlin.app

import object_oriented_kotlin.data.Application
import object_oriented_kotlin.data.Util

fun main() {
    println(Util.name)
    println(Util.toUpperCase("mama"))
    println(Application.Util.toUpperCase("wahyu"))

    // Companion object tanpa harus menginisialisasi nama objek tsb
    println(Application.toLower("RAMA"))
}