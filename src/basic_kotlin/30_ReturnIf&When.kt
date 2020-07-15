package basic_kotlin

// Fungsi return if mempermudah ketika ingin menambahkan sebuah
// kodisi

fun main() {

//    fun myName(num1: Int, num2: Int) : String {
//        return if (num1 %2 == 0 && num2 %2 == 0) {
//            return "$num1, $num2 merupakan bilangan genap"
//        } else {
//            return "Tidak bilangan genap"
//        }
//    }

    fun myName(num1: Int) : String {
        return when (num1) {
            0 -> "Ini $num1"
            1 -> "Ini $num1"
            else -> "Ini bukan $num1"
        }
    }


//    println(myName(8, 4))
    println(myName(1))
}