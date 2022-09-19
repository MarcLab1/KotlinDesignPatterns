package functionalprogramming

fun main() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    for (i in numbers) {
        println("$i is my fav number")
    }

    numbers.forEach { i: Int ->
        println("$i is a stupid number")
    }

    numbers.forEach(::println)

    val size = numbers::size
    println(size.get().toString())
}