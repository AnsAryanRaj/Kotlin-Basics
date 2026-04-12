package Basics

fun main(){
    println("Enter the two numbers: ")
    var num1=readln().toInt()
    var num2=readln().toInt()  //if we don't use toInt() then the number will concatenate
                               // instead of getting added

    var sum=num1+num2
    println("The sum of the numbers is : $sum")
}