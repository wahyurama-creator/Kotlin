package object_oriented_kotlin.data

class Person {
    var firstName: String = ""
    var midName: String? = null
    var lastName: String = ""

    fun fullName(firstName: String) : String {
        return "my first name is : ${this.firstName}, full name : $firstName"
    }

    fun lengthName(name: String): Int {
        println("firstLength : ${name.length}")
        return name.length
    }

    fun lengthName(name: String, result: String): Int {
        println("firstLength : ${name.length}, lastLength : ${result.length}")
        return name.length + result.length
    }

}