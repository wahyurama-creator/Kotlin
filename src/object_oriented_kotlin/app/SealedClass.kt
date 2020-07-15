package object_oriented_kotlin.app

import object_oriented_kotlin.data.Minus
import object_oriented_kotlin.data.Operation
import object_oriented_kotlin.data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    println(operation(10,5, Plus()))
    println(operation(5,2, Minus()))
}