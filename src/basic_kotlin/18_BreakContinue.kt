package basic_kotlin

fun main() {
    var i: Int = 10
    while (true) {
        println(i)
        i--
        if (i == 1) {
            break
        }
    }

    for (i in 10 downTo 1) {
        if (i % 2 == 0) {
            println("Angka genap : $i")
        }
        else if (i %2 == 1) {
            continue
        }

        break
    }

}