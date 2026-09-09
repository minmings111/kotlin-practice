package ch03.extensionproperties

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1) // property getter
    set(value: Char) { // property setter
        this.setCharAt(length - 1, value)
    }

fun main() {
    val sb = StringBuilder("Kotlin?")
    println(sb.lastChar)

    sb.lastChar = '!'
    println(sb)
}
