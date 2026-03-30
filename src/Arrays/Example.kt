package Arrays

fun main() {

    val numbers = arrayOf(10, 20, 30, 40, 50)

    println("Array elements: ${numbers.joinToString()}")

    println("First element: ${numbers[0]}")

    println("Last element: ${numbers[numbers.size - 1]}")
    numbers[2] = 35
    println("After modifying third element: ${numbers.joinToString()}")

    println("Iterating through array:")
    for (num in numbers) {
        println(num)
    }
}