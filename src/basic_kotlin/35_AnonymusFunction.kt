package basic_kotlin
// Fungsi didalam variable
fun main() {
    val pls = fun (value: Int?, result: Int) : Int? {
        return if (value == null) {
            value
        } else {
            return value + result
        }
    }

    println(pls(null, 10))
    println(pls(10,5))
}