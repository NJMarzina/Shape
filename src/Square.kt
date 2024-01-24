class Square(_name: String) : Shape(_name) {
    var length = 0.0
    var height = 0.0

    override fun setDimensions(vararg dimensions : Double){
        length = dimensions[0]
        height = dimensions[1]
    }

    override fun getArea(): Double {
        var area = length * height
        return area
    }

    override fun printDimensions() {
        println("The sides are: " + length + " and " + height)
    }
}