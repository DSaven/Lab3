/**
 * Класс социальной сети.
 */
class Twitter(userName: String, password: String) : Network(userName, password) {

    override fun logIn(userName: String, password: String): Boolean {
        println("Checking user's parameters")
        println("Name: $userName")
        print("Password: ")
        for (i in password.indices) {
            print("*")
        }
        println("LogIn success on Twitter")
        return true
    }

    override fun sendData(data: ByteArray): Boolean {
        println("Message: '" + String(data) + "' was posted on Twitter")
        return true
    }

    override fun logOut() {
        println("User: '$userName' was logged out from Twitter")
    }

}