package object_oriented_kotlin.data

open class Shape {
    open val radius = 0

    open fun myShape() {
        println("This is shape super")
    }
}

class Rectangle : Shape() {
    override val radius = 5
    val parentCorner = super.radius

    override fun myShape() {
        println("Shape after Override")
    }
}