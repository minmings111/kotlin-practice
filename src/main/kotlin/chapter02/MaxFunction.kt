package chapter02

fun main() {
    println(max(1,2))
}

fun max(a: Int, b: Int): Int {
//    "if" is an expression.
//    so Kotlin has no ternary operator.
    return if (a > b) a else b
}