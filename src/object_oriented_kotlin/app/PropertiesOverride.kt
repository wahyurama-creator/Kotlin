package object_oriented_kotlin.app

import object_oriented_kotlin.data.Rectangle
import object_oriented_kotlin.data.Shape

fun main() {
    val shape = Shape()
    println("Parent radius ${shape.radius}")
    shape.myShape()
    println()

    val rectangle = Rectangle()
    println("This ${rectangle.radius}")
    println("Parent ${rectangle.parentCorner}")
    rectangle.myShape()
}