package basic_kotlin

// Closure adalah kemampuan sebuah function, lambda atau anonymus function
// untuk berinterraksi dengan data-data disekitarnya dalam scope yang sama

fun main() {
    var counter: Int = 0
    val lambdaCIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymusIncrement = fun () {
        println("Fun Increment")
        counter++
    }

    lambdaCIncrement()
    anonymusIncrement()
    println(counter)
}