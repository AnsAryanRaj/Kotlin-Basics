package Loops

fun main() {
    println("Please enter a number: ")

    val input = readln()
    val inputAsInteger = input.toIntOrNull()

    if (inputAsInteger != null) {
        val isEven = inputAsInteger % 2 == 0
        println("Is the number even? $isEven")
    } else {
        println("Invalid input")
    }
}