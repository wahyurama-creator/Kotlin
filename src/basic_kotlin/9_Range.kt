package basic_kotlin

fun main() {
    // Range naik
    // val range = 0..10
    // Range turun
    val range = 100 downTo 1 step 2
    println(range)
    println(range.count())
    println(range.contains(10))
    println(range.contains(11))
    println(range.first)
    println(range.last)
    println(range.step)


    // count() = mendapatkan total data di range
    // contains(value) = mengecek apakah ada value
    // first = mendapatkan nilai pertama
    // last = mendapatkan nilai terahir
    // step = mendapatkan nilai tiap kenaikan
}