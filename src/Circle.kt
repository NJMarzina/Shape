class Circle(_name: String) : Shape(_name) {
    var radius = 0.0

    override fun setDimensions(vararg dimensions : Double){
        radius = dimensions[0]
    }

    override fun getArea(): Double {
        var area = 3.14*(radius*radius)
        return area
    }

    override fun printDimensions() {
        println("The radius is: " + radius)
    }
}