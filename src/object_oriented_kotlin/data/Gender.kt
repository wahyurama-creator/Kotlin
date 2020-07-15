package object_oriented_kotlin.data

enum class Gender(private val desc: String) {
    MALE("MALE"), FEMALE("FEMALE");

    fun showDesc() {
        println(desc)
    }
}