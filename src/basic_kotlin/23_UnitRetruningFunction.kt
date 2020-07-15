package basic_kotlin

fun main() {
    minus(5)
    minus(10, 2)
}

fun minus(firstNum: Int, lastNum: Int? = null) : Unit{
    if (lastNum == null) {
        println(firstNum)
    } else {
        println("$firstNum - $lastNum = ${firstNum-lastNum}")
    }
}