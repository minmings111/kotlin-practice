package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello, world!")
}

fun max(a: Int, b: Int): Int {
//    "if" is an expression.
//    so Kotlin has no ternary operator.
    return if (a > b) a else b
}
