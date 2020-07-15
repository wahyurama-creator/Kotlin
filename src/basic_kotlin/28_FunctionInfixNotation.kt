package basic_kotlin

fun main() {
    val result = "Wahyu Ramadhon Setyadji" to "uppercase"
    println(result)
}

// Infix notaion adalah operasi yang biasa dilakukan di operasi matematika
// dimana dia melakukan operasi terhadap dua data

infix fun String.to(type: String) : String {
    return if (type == "uppercase") {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}