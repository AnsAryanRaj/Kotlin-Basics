package Basics

fun main(){
    println("Please enter a number: ")
    val input=readln()
    val inputAsInteger= input.toIntOrNull()

    val isEven=inputAsInteger !! % 2==0
    println("Is the number even? $isEven")
}