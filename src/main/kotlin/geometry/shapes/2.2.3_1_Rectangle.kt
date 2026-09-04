package geometry.shapes

class Rectangle(val height: Int, val width: Int) {
    // true if height and width are same.
    val isSquare: Boolean
        get() {
            return height == width
        }
}

// Make a 1 x 1 square.
fun createUnitSquare(): Rectangle {
    return Rectangle(1, 1)
}
