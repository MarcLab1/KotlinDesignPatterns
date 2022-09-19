package dataflow

fun main() {

    val numbers: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 5, 6, 7)
    numbers.map {
        it
        //can continue
    }.filter {
        it < 1000
        //can continue
    }.onEach {
        //can continue
    }.forEach {
        //cannot continue -- terminating function
    }

    val letters = 'a'..'z'
    letters.map {
        print("$it ")
    }
    println()

    val newNumbers = numbers.filter { it % 2 == 0 }
    println(newNumbers)

    val firstOccurance = numbers.find { it % 2 == 0 }
    println(firstOccurance ?: "I am error")
}
