package object_oriented_kotlin.data

// Primary constructor
open class Customer(val name: String, val type: String, val balance: Long) {
    // Secondary constructor
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standard")
}

class PremiumCS : Customer {
    // Constructor primary in premium class
    constructor(name: String): super(name, "Premium")
    // Secondary constructor
    constructor(name: String, type: String): super(name, type)
    constructor(name: String, type: String, balance: Long): super(name, type, balance)
}

class ExecutiveCS(name: String, balance: Long) : Customer(name, "Executive", balance) {
    constructor(name: String): this(name, 0)
}