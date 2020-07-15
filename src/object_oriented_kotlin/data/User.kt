package object_oriented_kotlin.data

class User(var username: String, var password: String) {
    override fun toString(): String {
        return "User : $username, Password : $password"
    }

}