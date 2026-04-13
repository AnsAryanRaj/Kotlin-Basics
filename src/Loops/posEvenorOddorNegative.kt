package Loops

fun main(){
    println("Enter the number: ")
    val num=readln().toIntOrNull()
    if(num!=null){
        if(num> 0){
            if(num %2==0){
                println("Positive even")
            }else{
                println("Positive odd")
            }
        }
        else{
            println("Negative")
        }
    }
}