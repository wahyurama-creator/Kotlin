package basic_kotlin

fun main() {
    val firstName: String = "Wahyu"
    val midName: String = "Ramadhon"
    val lastName: String = "Setyadji"

    fullName(
        firstName = firstName,
        lastName = lastName,
        middleName = midName
    )
}

// Parameter dapat tidak urut dengan menyebut variable parameter tersebut
fun fullName (firstName: String, middleName: String, lastName: String) {
    println("FirstName '$firstName' midName '$middleName'" +
            " lastName '$lastName'")
}