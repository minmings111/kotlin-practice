package ch02.ex3_2_2_GetWarmth

import ch02.colors.Color
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


// Equality check.
fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO

        else -> throw Exception("Dirty color")
    }

// when without an argument.
// trade-off: readability.
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == RED) ->
                    ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
                (c1 == BLUE && c2 == YELLOW) ->
                    Color.GREEN

        (c1 == BLUE && c2 == VIOLET) ||
                (c1 == VIOLET && c2 == BLUE) ->
                    INDIGO

        else -> throw Exception("Dirty color")
    }

fun main() {
    println(getWarmthFromSensor())
    println(mix(BLUE, YELLOW))
    println(mixOptimized(BLUE, YELLOW))
}
