package basic_kotlin

fun main() {
    sayHello("Wahyu", "Rama")
    println(plus(10, 5))
}

fun sayHello (firstName: String, lastName: String) {
    println("Firstname : $firstName, Lastname : $lastName")
}

fun plus (firstNum: Int, lastNum: Int): Int {
    return firstNum + lastNum
}