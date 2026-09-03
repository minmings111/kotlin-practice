package chapter02

fun main() {
    val person = Person("Bob", true)
    println(person.name)

    //Bob
    println(person.isStudent) // kotlin called "getter"

    // ture
    person.isStudent = false // graduate // kotlin called "setter"
    println(person.isStudent)

}