package object_oriented_kotlin.data

// Sealed merupakan parent dan sebuah abstrak klass
sealed class Operation(var name: String)

class Plus: Operation(name = "Plus")
class Minus: Operation(name = "Minus")
