package Operators

fun main(){
    println("Enter the number: ")
    val input=readln()
    val number=input.toIntOrNull()?:0
    println("Number =$number")
}