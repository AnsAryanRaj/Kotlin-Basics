package Loops

fun main() {
    println("Enter the first number: ")
    val num1 = readln().toInt()
    println("Enter the first number: ")
    val num2 = readln().toInt()
    println("Enter the first number: ")
    val num3 = readln().toInt()

    val max = maxOf(num1, num2, num3)

    println("Greatest number is $max")
}