package object_oriented_kotlin.data

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "ID"

    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
                : this(paramStreet, paramCity) {
        country = paramCountry
    }
}