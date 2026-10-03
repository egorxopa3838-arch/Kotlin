# Kotlin
//калькулятор только на +

fun main() {
    println("число A")
    val one = readLine()?.toIntOrNull()
    println("число B")
    val two = readLine()?.toIntOrNull()
    if (one == null || two == null) {
    println("надо число!")
    return
    }
    
    println("$one + $two = ${one + two}")
}