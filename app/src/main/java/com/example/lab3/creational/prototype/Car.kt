class Car() : Hull() {
    var speed: Int = 0

    constructor(target: Car) : this() {
        speed = target.speed
    }

    override fun clone(): Shape {
        return Car(this)
    }
    
}