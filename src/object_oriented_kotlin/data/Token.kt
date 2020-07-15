package object_oriented_kotlin.data

inline class Token (val value: String) {
    fun lengthTok(): Int {
        return value.length
    }
}