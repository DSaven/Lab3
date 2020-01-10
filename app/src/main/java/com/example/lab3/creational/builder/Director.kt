class Director {

    fun constructSportsPlane(builder: Builder) {
        builder.setType(Type.SPORT)
        builder.setSeats(2)
        builder.setEngine(Engine(3.0, 0.0))
        builder.setTransmission(Transmission.SEMI_AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPS(GPSNavigator())
    }

    fun constructMilitaryPlane(builder: Builder) {
        builder.setType(Type.MILITARY)
        builder.setSeats(2)
        builder.setEngine(Engine(1.2, 0.0))
        builder.setTransmission(Transmission.AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPS(GPSNavigator())
    }
}