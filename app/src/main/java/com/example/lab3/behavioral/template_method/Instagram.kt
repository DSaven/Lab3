/**
 * Класс социальной сети.
 */
class Instagram(userName: String, password: String) : Network(userName, password) {

    override fun logIn(userName: String, password: String): Boolean {
        println("Checking user data")
        println("Name: $userName")
        print("Password: ")
        for (i in password.indices) {
            print("*")
        }
        println("LogIn success on Instagram")
        return true
    }

    override fun sendData(data: ByteArray): Boolean {
        println("Message: '" + String(data) + "' was posted on Instagram")
        return true
    }

    override fun logOut() {
        println("User: '$userName' was logged out from Instagram")
    }

}