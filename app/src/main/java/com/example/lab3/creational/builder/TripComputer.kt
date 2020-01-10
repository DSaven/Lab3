class TripComputer {
    var plane: Plane? = null

    fun showFuelLevel() {
        println("Fuel level: ${plane?.fuel}")
    }

    fun showStatus() {
        if (plane?.engine != null && plane?.engine!!.isStarted) {
            println("Plane is started")
        } else {
            println("Plane isn't started")
        }
    }
}