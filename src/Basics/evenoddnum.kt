package Basics

fun main(){
    println("Enter the number: ")
    val num=readln().toInt()
    if(num % 2==0){
        println("number is even")
    }else{
        println("number is odd")
    }
}