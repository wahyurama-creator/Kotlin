package object_oriented_kotlin.data

class Company(val number: Int) {

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> other.number == this.number
            else -> false
        }
    }

    override fun hashCode(): Int {
        return number.hashCode()
    }
}