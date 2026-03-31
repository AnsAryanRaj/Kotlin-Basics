package Functions

fun sendMessage(name: String) {
    println("Good Morning $name")
}

fun main() {
    for (i in 1..5) {
        sendMessage("Roll No $i")
    }
}