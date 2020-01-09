class Engine(var volume: Double, var distance: Double) {
    var isStarted: Boolean = false

    fun on() {
        isStarted = true
    }

    fun off() {
        isStarted = false
    }

    fun go(distance: Double) {
        if (isStarted) {
            this.distance += distance
        } else {
            System.err.println("Cannot go(), you must start engine first!")
        }
    }
}