class ThrottlingMiddleware(private val requestPerMinute: Int) : Middleware() {

    private var request: Int = 0
    private var curTime: Long = 0

    init {
        curTime = System.currentTimeMillis()
    }

    /**
     * Обратите внимание, вызов checkNext() можно вставить как в начале этого
     * метода, так и в середине или в конце.
     *
     * Это даёт еще один уровень гибкости по сравнению с проверками в цикле.
     * Например, элемент цепи может пропустить все остальные проверки вперёд и
     * запустить свою проверку в конце.
     */
    override fun check(email: String, password: String): Boolean {
        if (System.currentTimeMillis() > curTime + 50000) {
            request = 0
            curTime = System.currentTimeMillis()
        }

        request++

        if (request > requestPerMinute) {
            println("Request limit exceeded!")
            Thread.currentThread().stop()
        }
        return checkNext(email, password)
    }
}