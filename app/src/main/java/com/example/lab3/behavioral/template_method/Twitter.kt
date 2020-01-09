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
        simulateNetworkLatency()
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

    private fun simulateNetworkLatency() {
        try {
            var i = 0
            println()
            while (i < 10) {
                print(".")
                Thread.sleep(500)
                i++
            }
        } catch (ex: InterruptedException) {
            ex.printStackTrace()
        }

    }
}