package basic_kotlin// variable konstan GLOBAL
// Tidak bisa menggunakan var

    const val MY_AGE: Int = 20


fun main() {
    // var = merupakan variable yang bisa dirubah (Muttable)
    // val = merupakan variable yang tidak bisa dirubah (Immutable)

    val name = "Wahyu"
    // name = "rama"
    var nama = "wahyu"
    nama = "rama"
    println("Nama : $nama, Age : $MY_AGE")

    // variable NULLable menggunakan '?' pada bagian ahir perintah
    var firstName: String? = "wahyu"
    // firstName.length
    println(firstName?.length)
    firstName = null
    println(firstName?.length)
}