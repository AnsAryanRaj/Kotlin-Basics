package Loops

fun main(){
    println("Enter the number: ")
    val num=readln().toInt()
    if(num!=null) {
        println("Cube is ${num*num*num}")
    }
    else{
        println("Number is invalid")
    }

}