package Loops

fun main(){
    println("Enter the number")

    val input=readln()
    val num=input.toIntOrNull()

    if(num!=null){
        println("Square= ${num*num}")
    }else{
        println("Invalid Input")
    }
}