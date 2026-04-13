package Loops

fun main(){
    println("Enter a number: ")

    val number=readln().toIntOrNull()
    val result=number?.let{
        "valid number:$it"

    }?:"error:invalid input"
    println(result)
}
