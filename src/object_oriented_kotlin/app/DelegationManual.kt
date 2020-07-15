package object_oriented_kotlin.app

import object_oriented_kotlin.data.MyBase
import object_oriented_kotlin.data.MyBaseDelegate

fun main() {
    val base = MyBase()
    println(base.sayBase("HAI"))

    val baseDelegate = MyBaseDelegate(base)
    println(baseDelegate.sayBase("BASE"))
}