package Loops

fun main(){
    println("Enter the first number: ")
    val num1=readln().toInt()
    println("Enter the second number: ")
    val num2=readln().toInt()
    println("Enter the third number: ")
    val num3=readln().toInt()
    if(num1> num2 && num1 > num3){
        println("num1 $num1 is greatest!")
    }
    else if(num2> num1 && num2 > num3){
        println("num2 $num2 is greatest")
    }
    else{
        println("num3 $num3 is greatest")
    }
}