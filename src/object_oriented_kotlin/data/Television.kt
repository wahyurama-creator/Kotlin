package object_oriented_kotlin.data

class Television {
    lateinit var brand: String

    fun initTV(name: String) {
        this.brand = name
    }
}

// Tidak boleh melakukan inisialisasi pada interfaces
interface LED {
    val type: String
    fun sayLED(name: String)
}

interface Atena {
    val hz: Int
    fun sayHz(name: String)
}

class LedType(override val type: String) : LED {
    override fun sayLED(name: String) {
        println("LED name: $name, Type: ${this.type}")
    }
}

class AtenaType(override val hz: Int,
                override val type: String) : LED, Atena {
    override fun sayHz(name: String) {
        println("Atena Hz: $hz, TV type: ${this.type}")
    }

    override fun sayLED(name: String) {
        println("LED name: $name, Type: ${this.type}")
    }
}