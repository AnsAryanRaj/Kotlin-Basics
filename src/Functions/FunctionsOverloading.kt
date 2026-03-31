package Functions

fun main(){

    Greet1("Rahul")
    Greet1("Aryan","Raj")
}
fun greet1(){
    println("Hello, student")


}
fun Greet1(name:String){
    println("Hello, $name")
}
fun Greet1(firstname:String,lastname:String ){
    println("Hello,$firstname $lastname")
}