package ch02.colors

// Color list. Values are fixed.
// r, g, b mean red, green, blue.
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 255),
    VIOLET(238, 130, 238); // MUST USE semicolon before more code.

    // rgb value for each color.
    val rgb = (r * 256 + g) * 256 + b

    // Print this color and rgb value.
    fun printColor() = println("$this is $rgb")
}

fun main() {
    println(Color.BLUE.rgb)
    Color.GREEN.printColor()
}
