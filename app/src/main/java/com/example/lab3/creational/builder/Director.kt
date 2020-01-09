class Director {

    fun constructSportsCar(builder: Builder) {
        builder.setType(Type.SPORT)
        builder.setSeats(2)
        builder.setEngine(Engine(3.0, 0.0))
        builder.setTransmission(Transmission.SEMI_AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPS(GPSNavigator())
    }

    fun constructCityCar(builder: Builder) {
        builder.setType(Type.CITY)
        builder.setSeats(2)
        builder.setEngine(Engine(1.2, 0.0))
        builder.setTransmission(Transmission.AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPS(GPSNavigator())
    }

    fun constructSUV(builder: Builder) {
        builder.setType(Type.SUV)
        builder.setSeats(4)
        builder.setEngine(Engine(2.5, 0.0))
        builder.setTransmission(Transmission.MANUAL)
        builder.setGPS(GPSNavigator())
    }
}