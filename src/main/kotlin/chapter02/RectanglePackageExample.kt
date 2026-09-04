package chapter02

import chapter02.shapes.createUnitSquare
import chapter02.shapes.Rectangle

fun main() {
    println(Rectangle(3, 4).isSquare)
    println(createUnitSquare().isSquare)
}