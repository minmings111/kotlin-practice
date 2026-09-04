package ch02.ex3_2_2_GetWarmth

import ch02.colors.Color

fun measureColor() = Color.ORANGE

fun getWarmthFromSensor(): String {
    val color = measureColor()
    return when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm(red=${color.r})"
        Color.GREEN -> "neutral(green=${color.g})"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold(blue=${color.b})"
    }
}

fun main() {
    println(getWarmthFromSensor())
}
