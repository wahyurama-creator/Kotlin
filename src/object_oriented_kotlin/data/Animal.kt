package object_oriented_kotlin.data

abstract class Animal {
    abstract var name: String
    abstract fun animalKind()
}

class InheritAnimal: Animal() {
    override var name: String = "Animal Crossing"

    override fun animalKind() {
        println("It is Animal abstract fun")
    }

}