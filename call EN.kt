fun main() {
    while (true) {
        println("Number A (or 'exit')")
        val input = readLine()
        
        if (input == "exit") {
            println("Bye!")
            break
        }
        
        val one = input?.toIntOrNull()
        
        println("Number B")
        val two = readLine()?.toIntOrNull()

        if (one == null || two == null) {
            println("Must be a number!")
        } else {
            println("$one + $two = ${one + two}")
        }
    }
}