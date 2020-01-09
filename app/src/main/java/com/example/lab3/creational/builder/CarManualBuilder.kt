class CarManualBuilder : Builder {
    private var type: Type = null
    private var seatsQuantity: Int = 0
    private var engine: Engine = null
    private var transmission: Transmission = null
    private var tripComputer: TripComputer = null
    private var GPS: GPSNavigator = null

    override fun setType(type: Type) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seatsQuantity = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(GPS: GPSNavigator) {
        this.GPS = GPS
    }

    fun getResult(): Manual {
        return Manual(type, seatsQuantity, engine, transmission, tripComputer, GPS)
    }
}