package Arrays

fun main() {
    val arr = Array(3) { 0 }

    for (i in 0..2) {
        arr[i] = i * 10
    }

    println(arr.joinToString())
}