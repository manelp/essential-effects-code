import scala.io.StdIn.readLine

// Substitution
def plusOne(i: Int): Int = i + 1

val x = plusOne(plusOne(12))

// Doesn't handle all cases

// printing
val y = println("Hello world!")

// reading from user
//val name = readLine

// using mutable variables
var i = 12
val x = { i += 1; i }