import java.util.*

abstract class Hull() {
    var x: Int = 0
    var y: Int = 0
    var color: String? = null

    constructor(target: Hull) : this() {
        x = target.x
        y = target.y
        color = target.color
    }

    abstract fun clone(): Hull

}