package basic_kotlin

fun toLow(name: String) : String = name.toLowerCase()

// Lambda secara sederhana adalah function yang tidak memiliki nama

fun main() {
    // Membuat lambda
    val lambdaName: (String) -> String = {
        value: String -> value.toUpperCase()
        value
    }

    val lamDa: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName , $lastName"
        result
    }

    val jumlah: (Int, Int) -> Int = { firstNum: Int, lastNum: Int ->
        val result = firstNum + lastNum
        result
    }
    println(lambdaName("wahyu"))
    println(lamDa("wahyu", "ramadhon"))
    println(jumlah(10, 5))

    // Tanpa parameter menggunakan it

    val iT: (String) -> Int = {
        val panjang = it.length
        panjang
    }
    println(iT("Wahyu"))

    // Method Reference

    val toLowerCase: (String) -> String = ::toLow
    println(toLowerCase("WAHYU"))
}