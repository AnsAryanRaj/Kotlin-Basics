package Functions

fun main(){
    calculateMarks(maths=80, science=75, english=90)

}
fun calculateMarks(maths:Int, science:Int, english:Int){

    val total=maths+science+english
    println("Your total marks is : $total")


}