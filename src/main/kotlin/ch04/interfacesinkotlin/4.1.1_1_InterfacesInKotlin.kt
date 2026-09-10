package ch04.interfacesinkotlin

interface Clickable {
    fun click() // normal method declaration
    fun showOff() = println("I'm clickable!") // method with default body
}

interface Focusable {
    fun setFocus(b: Boolean) {
        println("I ${if (b) "got" else "lost"} focus.")
    }

    fun showOff() {
        println("I'm focusable!")
    }
}

// Clickable and Focusable both have showOff().
// Compile error:
// class Button : Clickable, Focusable {
//     override fun click() = println("I was clicked")
// }

// So Button must override showOff().
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}
