package basic_kotlin

// High Order Func adalah function yang menggunakan
// function sebagai parameter atau mengembalikan fun
fun main() {
    fun highOrder(name: String, fullName: (String) -> String) : String {
        return fullName(name)
    }

    val highOrdertoUpper = {value: String -> value.toUpperCase()}
    val highOrdertoLower = {value: String -> value.toLowerCase()}

    println(highOrder("rama", highOrdertoUpper))
    println(highOrder("Wahyu", highOrdertoLower))

    // Trailing Lambda
    val result = highOrder("WAHYU RAMADHON SETYADJI") { value: String
        -> value.toLowerCase()
    }
    println(result)
}


