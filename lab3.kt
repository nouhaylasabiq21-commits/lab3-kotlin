fun main() {

    val height = 5

    println(" Triangle inversé centré ")
    for (i in 1..height) {
        repeat(i - 1) { print(" ") }
        repeat(2 * (height - i) + 1) { print("*") }
        println()
    }

    println("\n Triangle aligné à droite ")
    for (i in 1..height) {
        repeat(height - i) { print(" ") }
        repeat(i) { print("*") }
        println()
    }

    println("\n  Losange centré ")

    
    for (i in 1..height) {
        repeat(height - i) { print(" ") }
        repeat(2 * i - 1) { print("*") }
        println()
    }

    for (i in height - 1 downTo 1) {
        repeat(height - i) { print(" ") }
        repeat(2 * i - 1) { print("*") }
        println()
    }
}
