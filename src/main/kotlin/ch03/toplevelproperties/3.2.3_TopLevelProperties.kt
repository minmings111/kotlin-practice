package ch03.toplevelproperties

import kotlin.math.E
import kotlin.math.PI
import kotlin.math.max

var opCount = 0

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times") // read top-level property
}

const val UNIX_LINE_SEPARATOR = "\n"

fun main() {
    performOperation()
    reportOperationCount()
    println(max(PI, E))
}
