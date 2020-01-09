open class BasicRemote(protected var device: Device) : Remote {

    override fun power() {
        println("Remote: power toggle")
        if (device.isEnabled) {
            device.disable()
        } else {
            device.enable()
        }
    }

    override fun speedDown() {
        println("Remote: speed down")
        device.volume = device.volume - 10
    }

    override fun speedUp() {
        println("Remote: speed up")
        device.speed = device.speed + 10
    }

    override fun rotationLeft() {
        println("Remote: rotated left")
        device.rotation = device.rotation - 10
    }

    override fun channelUp() {
        println("Remote: rotated right")
        device.rotation = device.rotation + 10
    }
}