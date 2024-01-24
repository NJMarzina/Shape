import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0

    override open fun setDimensions(vararg dimensions : Double){
        side1 = dimensions[0]
        side2 = dimensions[1]
        side3 = dimensions[2]
    }

    open override fun getArea(): Double {
        var s = (side1 + side2 + side3) / 2.0
        var area = sqrt(s*(s-side1)*(s-side2)*(s-side3))
        return area
    }

    override fun printDimensions() {
        println("The sides are: " + side1 + " and " + side2 + " and " + side3)
    }
}