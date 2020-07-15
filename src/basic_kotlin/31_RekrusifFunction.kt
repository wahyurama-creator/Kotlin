package basic_kotlin

// Function yang memanggil dirinya sendiri dinamakan Rekrusif

fun main() {
    // Ketika menggunakan Loop
//    fun factorialRecursive(num: Int) : Int {
//        var result: Int = 1
//        for (i in num downTo 1) {
//            result *= 1
//        }
//        return result
//    }

    fun factorialRecursive(num: Int) : Int {
        return when(num) {
            1 -> 1
            else -> num * factorialRecursive(num - 1)
        }
    }

    println(factorialRecursive(5))
}