class Round() : Shape() {
    var radius: Int = 0

    constructor(target: Round) : this() {
        radius = target.radius
    }

    override fun clone(): Shape {
        return Round(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Round || !super.equals(other)) return false
        return other.radius == radius
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + radius
        return result
    }
}