class Car : Device {
    override var isEnabled = false
    override var speed = 30
        set(speed) {
            field = when {
                speed > 100 -> 100
                speed < 0 -> 0
                else -> speed
            }
        }
    var rotation = 0

    override fun enable() {
        isEnabled = true
    }

    override fun disable() {
        isEnabled = false
    }

    override fun printStatus() {
        println("------------------------------------")
        println("| I'm Car.")
        println("| I'm " + if (isEnabled) "enabled" else "disabled")
        println("| Current speed is " + this.speed + "%")
        println("| Current rotation is $rotation")
        println("------------------------------------\n")
    }
}