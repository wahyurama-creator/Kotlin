package object_oriented_kotlin.data

interface Base {
    fun sayBase(value: String): String {
        return "Base: $value"
    }
}

class MyBase: Base {
    override fun sayBase(value: String): String {
        return super.sayBase(value)
    }
}

class MyBaseDelegate(val base: Base): Base by base