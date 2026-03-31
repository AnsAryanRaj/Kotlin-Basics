package Functions

fun main(){
    orderFood("Samosa",2)
    orderFood("Pizza", 1)
}
fun orderFood(item:String, quantity:Int){
    println("Your order is $item $quantity")
}