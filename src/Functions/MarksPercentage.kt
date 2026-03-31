package Functions

fun main(){
    var percentage = calculatePercentage(245, 300)
    println("Your percentage is : $percentage")

}
fun calculatePercentage(marks:Int, totalMarks:Int):Float{
    return (marks.toFloat()/totalMarks)*100


}