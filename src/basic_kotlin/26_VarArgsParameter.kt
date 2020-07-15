package basic_kotlin

fun main() {
    println(resultValue(5, 10))
}


fun resultValue(firstNum: Int, vararg value: Int): Int {
    var total = 0

    for (values in value) {
        total = firstNum + values
    }

    return total
}