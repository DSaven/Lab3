class Plane(var type: Type, var seats: Int, var engine: Engine, var transmission: Transmission,
            var tripComputer: TripComputer?, var GPS: GPSNavigator?) {

    init {
        tripComputer.car = this
    }

    var fuel = 0.0
}