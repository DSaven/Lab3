interface Device {
    val isEnabled: Boolean

    var speed: Int

    var rotation: Int

    fun enable()

    fun disable()

    fun printStatus()
}