package Loops

fun main(){
    println("Enter the marks: ")
    val marks=readln().toInt()

    when(marks){
        in 90..100->println("A")
        in 80..89->println("B")
        in 70..79->println("C")
        in 60..69->println("D")
        else -> println("Fail")
    }
}