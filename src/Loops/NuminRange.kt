package Loops

fun main() {
    println("Enter the number: ")
    val num = readln().toIntOrNull()

    if (num != null) {
        if (num in 1..100) {
            println("Number is in the range 1-100")
        } else {
            println("Number is not in range")
        }
    } else {
        println("Invalid input")
    }
}