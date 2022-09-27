package misc

fun main() {
    val dogs: List<String> = listOf<String>("AVERY", "AvErY", "Willow", "avery", "Rover")

    for ((index, dog) in dogs.withIndex()) {
        println("$index $dog")
    }

    for (i in dogs.indices) {
        println(dogs[i])
    }

    val unique = dogs.distinct()
    println(unique)

    val reallyUnique = dogs.distinctBy {
        it.lowercase()
    }.map { it.lowercase() }

    println(reallyUnique)

}