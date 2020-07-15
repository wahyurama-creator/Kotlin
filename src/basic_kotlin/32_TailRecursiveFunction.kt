package basic_kotlin

// Tail Reksrusif adalah teknik menguah teknik rekrusif yang kita buat
// menjadi looping biasa ketika dijalankan

fun main() {
    tailrec fun display(value : Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int): Int {
        return when(value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }

//    display(10000)
    println(factorialRecursive(10,1))
}