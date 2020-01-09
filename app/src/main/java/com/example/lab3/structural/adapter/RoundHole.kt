class RoundHole(private val radius: Double) {

    fun fits(peg: RoundPeg) = radius >= peg.getRadius()
}