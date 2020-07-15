package basic_kotlin

fun main() {
    sayToMe("Love")
    sayToMe("Love", "U")
}

// Function default parameter
fun sayToMe (firstSay: String, lastSay: String? = null) {
    if (lastSay == null) {
        println("Your say is '$firstSay'.")
    } else {
        println("Your say is '$firstSay' and '$lastSay'.")
    }
}
