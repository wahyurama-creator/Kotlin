package object_oriented_kotlin.data

class Application (val value: String) {
    object Util {
        fun toUpperCase(name: String): String {
            return name.toUpperCase()
        }
    }

    companion object {
        fun toLower(name: String): String {
            return name.toLowerCase()
        }
    }
}