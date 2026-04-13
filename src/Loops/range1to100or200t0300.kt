package Loops

fun main() {
    println("Enter the number: ")
    val num = readln().toIntOrNull()

    when {
        num == null -> println("Invalid input")
        num in 1..100 -> println("Number is in range 1-100")
        num in 200..300 -> println("Number is in range 200-300")
        else -> println("Number is not in any range")
    }
}