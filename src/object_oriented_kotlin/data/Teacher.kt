package object_oriented_kotlin.data

open class Teacher(val name: String) {
    private fun myTeach(nameParam: String) {
        println("Im ${this.name}, Im teach $nameParam")
    }
}

class StudentTeach(name: String) : Teacher(name) {
    val nameParam = this.name
}