fun main() {
    while (true) {
        println("число A (или 'exit')")
        val input = readLine()
        
        if (input == "exit") {
            println("Пока!")
            break
        }
        
        val one = input?.toIntOrNull()
        
        println("число B")
        val two = readLine()?.toIntOrNull()

        if (one == null || two == null) {
            println("Надо число!")
        } else {
            println("$one + $two = ${one + two}")
        }
    }
}