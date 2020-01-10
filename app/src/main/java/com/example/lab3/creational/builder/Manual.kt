class Manual(var type: Type?, var seats: Int?, var engine: Engine?, var transmission: Transmission?,
             var tripComputer: TripComputer?, var GPS: GPSNavigator?) {

    fun print(): String {
        var info = ""
        info += "Type of plane: $type\n"
        info += "Count of seats: $seats\n"
        info += "Engine: volume - " + engine?.volume + "; mileage - " + engine?.distance + "\n"
        info += "Transmission: $transmission\n"
        info += if (tripComputer != null) {
            "Trip Computer: Functional" + "\n"
        } else {
            "Trip Computer: N/A" + "\n"
        }
        info += if (GPS != null) {
            "GPS Navigator: Functional" + "\n"
        } else {
            "GPS Navigator: N/A" + "\n"
        }
        return info
    }
}