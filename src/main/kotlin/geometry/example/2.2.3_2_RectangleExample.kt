package geometry.example

import geometry.shapes.createUnitSquare
import geometry.shapes.Rectangle

fun main() {
    println(Rectangle(3, 4).isSquare)
    println(createUnitSquare().isSquare)
}
