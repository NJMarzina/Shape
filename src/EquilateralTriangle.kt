import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {
    var side = 0.0

    override fun setDimensions(vararg dimensions : Double){
        side = dimensions[0]
    }

    override fun getArea(): Double {
        var s = (side + side + side) / 2.0
        var area = sqrt(s*(s-side)*(s-side)*(s-side))
        return area
    }

    override fun printDimensions() {
        println("The sides are all: " + side)
    }
}