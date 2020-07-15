package object_oriented_kotlin.data

// Singleton Object
object Util {
    val name: String = "Util"

    fun toUpperCase(value: String): String {
        return value.toUpperCase()
    }
}