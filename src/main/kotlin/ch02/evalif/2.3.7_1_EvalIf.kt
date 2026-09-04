package ch02.evalif

interface Expr // marker interface

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// 1-1. if expression + smart cast version
//fun eval(e: Expr): Int =
//    if (e is Num) {
//        e.value
//    } else if (e is Sum) {
//        eval(e.right) + eval(e.left) // recursion
//    } else {
//        throw IllegalArgumentException("Unknown expression")
//    }


// 1-2. short version
//fun eval(e: Expr): Int =
//    if (e is Num) e.value
//    else if (e is Sum) eval(e.right) + eval(e.left)
//    else throw IllegalArgumentException("Unknown expression")


// 2. when version
fun eval(e: Expr): Int =
    when(e) {
        // smart cast
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)

        else -> throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)

            println("sum: $left + $right") // only print. return is "Unit"
            left + right // return is "Int"
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }


fun main() {
    println(eval(Sum(Num(1), Num(2))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}
