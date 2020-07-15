package object_oriented_kotlin.data

class Car(paramBrand: String, paramType: String, paramWheel: Int = 4) {
    init {
        println("Car $paramBrand bertipe $paramType dengan $paramWheel roda")
    }

    constructor(paramBrand: String, paramType: String) :
            this(paramBrand, paramType, 4) {
        println("Secondary constructor")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Third constructor")
    }

    var brand: String = paramBrand
    var type: String = paramType
    var wheel: Int = paramWheel
}