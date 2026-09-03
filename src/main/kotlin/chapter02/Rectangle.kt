package chapter02

class Rectangle(val height: Int, val width: Int) {
    // on the go property
    val isSquare: Boolean
        get() {
            return height == width
        }
}