package basic_kotlin

fun main() {
    val name: Array<String> = arrayOf("Wahyu", "Ramadhon", "Setyadji")

    name.set(0, "rama")
    println(name[0])

    val nilai: Array<Int> = arrayOf(1,2,3)
    print(nilai[0])

    // Perintah Jika array bisa null
    val member: Array<String?> = arrayOfNulls(4)
    member[0] = "w"
    member[1] = "a"
    member[2] = null
    member[3] = "h"
    print(member[0])
}