fun main() {
    var square:Shape = Square("Nathan")
    var circle:Shape = Circle("Josh")
    var triangle:Shape = Triangle("Henry")
    var eqTriangle:Shape = EquilateralTriangle("Joey")

    print("Enter side 1 for square: ")
    val squareSide1 = readLine()!!

    print("Enter side 2 for square: ")
    val squareSide2 = readLine()!!

    square.setDimensions(squareSide1.toDouble(), squareSide2.toDouble())
    println("The area of: " + square.name + " is " + square.getArea())
    square.printDimensions()

    print("Enter radius for circle: ")
    val radius = readLine()!!

    circle.setDimensions(radius.toDouble())
    println("The area of: " + circle.name + " is " + circle.getArea())
    circle.printDimensions()

    print("Enter side 1 for triangle: ")
    val triangleSide1 = readLine()!!

    print("Enter side 2 for triangle: ")
    val triangleSide2 = readLine()!!

    print("Enter side 3 for triangle: ")
    val triangleSide3 = readLine()!!

    triangle.setDimensions(triangleSide1.toDouble(), triangleSide2.toDouble(), triangleSide3.toDouble())
    println("The area of: " + triangle.name + " is " + triangle.getArea())
    triangle.printDimensions()

    print("Enter side for equilateral triangle: ")
    val eqSide = readLine()!!

    eqTriangle.setDimensions(eqSide.toDouble())
    println("The area of: " + eqTriangle.name + " is " + eqTriangle.getArea())
    eqTriangle.printDimensions()
}