class AdvancedRemote(device: Device) : BasicRemote(device) {

    fun explode() {
        println("Device exploded")
        device.speed = 0
        device.rotation = 0
    }
}