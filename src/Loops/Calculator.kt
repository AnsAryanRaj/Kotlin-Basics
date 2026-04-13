package Loops

fun main(){
    println("Enter the number1 : ")
    val num1=readln().toInt()
    println("Enter the number2 : ")
    val num2=readln().toInt()
    println("Enter the operator: ")
    var operator=readln()
    when(operator){
        "+"->println(num1+num2)
        "-"->println(num1-num2)
        "*"->println(num1*num2)
        "/"->println(num1/num2)
    }

}