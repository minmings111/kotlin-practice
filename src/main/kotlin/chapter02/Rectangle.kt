package chapter02.shapes // package declaration

class Rectangle(val height: Int, val width: Int) {
    // on the go property
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun createUnitSquare() : Rectangle {
    return Rectangle(1, 1)
}