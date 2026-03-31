package Functions

fun greet3(name:String){
    println("Hello$name")
}

fun greet3(name:String, age:Int){
    println("$name is $age years old")
}

fun main(){
    greet3("Anshu")
    greet3("Anshu",20)
}