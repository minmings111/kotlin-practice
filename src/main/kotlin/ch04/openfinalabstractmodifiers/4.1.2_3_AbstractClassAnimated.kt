package ch04.openfinalabstractmodifiers

abstract class Animated { // Cannot make an instance of an abstract class.
    // Abstract property.
    // No value here. Subclass must give value or accessor.
    abstract val animationSpeed: Double

    val keyframes: Int = 20
    open val frames: Int = 60 // Subclass can override

    abstract fun animate() // Subclass must override this function.
    open fun stopAnimating() {}
    fun animateTwice() {}
}
