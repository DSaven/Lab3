class Car() : Hull() {
    var radius: Int = 0

    constructor(target: Car) : this() {
        radius = target.radius
    }

    override fun clone(): Shape {
        return Car(this)
    }
    
}