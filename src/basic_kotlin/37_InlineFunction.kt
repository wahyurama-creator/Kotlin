package basic_kotlin
// Inline
inline fun myName(fisrtName: () -> String) : String {
    return "Hello ${fisrtName()}"
}
// Noinline
inline fun lastName(fisrtName: () -> String,
                    noinline lastName: () -> String) : String {
    return  "Hello ${fisrtName()} ${lastName()}"
}

fun main() {
    println(myName { "wahyu" })
    println(lastName({"Wahyu"}, {"rama"}))
}