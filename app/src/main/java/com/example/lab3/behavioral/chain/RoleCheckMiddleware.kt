class RoleCheckMiddleware : Middleware() {

    override fun check(email: String, password: String): Boolean {
        if (email == "example@example.com") {
            println("Hello, admin!")
            return true
        }
        println("Hello, user!")
        return checkNext(email, password)
    }
}