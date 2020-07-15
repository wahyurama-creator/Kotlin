package basic_kotlin

fun main() {
    val number: Int = 10
    println(number.first())
    val name: String = "wahyu"
    name.printHello()
}

// Extension fun adalah kemampuan menambahkan function
// pada tipe data yang sudah ada

fun Int.first(): Int = this

fun String.printHello() : Unit = println("Hello $this")