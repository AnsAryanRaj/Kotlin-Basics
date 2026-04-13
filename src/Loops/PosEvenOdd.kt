package Loops

fun main(){
    println("Enter the number : ")
    val num=readln().toInt()

    if(num>0){
        if(num%2==0){
            println("Positive Even")
        }
        else{
            println("Positive Odd")
        }
    }
}