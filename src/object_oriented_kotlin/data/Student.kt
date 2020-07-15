package object_oriented_kotlin.data

class Student(val name: String?, val age: Int?)

fun Student?.sayName(name: String) {
    when {
        this != null -> {
            println("My name is: ${name}, My age is ${this.age}")
        }
        else -> {
            println("It is NULL")
        }
    }
}

val Student?.toUpperName : String?
    get() = this?.name?.toUpperCase()