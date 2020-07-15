package basic_kotlin

fun main() {
    var name: Array<String> = arrayOf("wahyu", "ramadhon", "setyadji")

    for (names in name) {
        println(names)
    }

    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    val ukuranArray = name.size - 1

    for (i in 0..ukuranArray) {
        println("Index ke $i = ${name.get(i)}")
    }
}