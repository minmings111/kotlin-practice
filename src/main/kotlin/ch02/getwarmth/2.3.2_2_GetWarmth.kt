package ch02.getwarmth

import ch02.colors.Color.* // Import Color values.

fun measureColor() = ORANGE

fun getWarmthFromSensor() =
    when (val color = measureColor()) {
        RED, ORANGE, YELLOW ->
            "warm(red=${color.r})"
        GREEN ->
            "neutral(green=${color.g})"
        BLUE, INDIGO, VIOLET ->
            "cold(blue=${color.b})"
    }

fun main() {
    println(getWarmthFromSensor())
}
