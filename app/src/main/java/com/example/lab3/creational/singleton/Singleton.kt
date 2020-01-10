class Singleton(value: String) {
    var value: String? = value

    companion object {
        private var instance: Singleton? = null

        fun getInstance(value: String): Singleton {
            if (instance == null) {
                instance = Singleton(value)
            }
            return instance
        }
    }
}