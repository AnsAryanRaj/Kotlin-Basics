package Operators

//Elvis operator is used to provide a default value when something is null
fun main(){
    val name: String? =null
    val result=name?:"Guest"
    println(result)
}

//If value is Not null->use it
//If value is null -> use defaultValue
