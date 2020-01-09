open class RoundPeg() {
    var radius: Double? = null

    constructor(radius: Double) : this() {
        this.radius = radius
    }

    open fun getRadius() = radius!!
}