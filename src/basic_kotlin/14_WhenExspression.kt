package basic_kotlin

fun main() {
    // When itu seperti Switch Case
    val finalExam = 10

    when (finalExam) {
        50 -> println("D")
        60 -> println("C")
        70 -> println("B")
        80 -> println("A")
        90 -> println("AA")
        100 -> println("AAA")
        10, 20, 30, 40 -> println("E")
        else -> println("Bad")
    }

    val grade: Array<Int> = arrayOf(70,80,90)
    when (finalExam) {
        in grade -> println("Anda Lulus")
        !in grade -> println("Gagal")
    }
}