package object_oriented_kotlin.app
import object_oriented_kotlin.exception.ValidationException

fun validate(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("This value not contain null")
    }
}

fun main() {
    try {
        validate("Brian")
        validate("")
    } catch (error: ValidationException) {
        println("Error happen because ${error.cause}")
    } finally {
        println("Ending code")
    }
}