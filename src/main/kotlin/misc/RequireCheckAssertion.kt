package misc
//require for arguments, check for state

fun main() {
    val name: String = "MLab1"
    val age: Int = 43
    val dogs: List<String> = listOf<String>("Avery", "Willow")
    var feelingState: String = "relaxed"

    checkNotNull(feelingState)
    println(feelingState)


}

//not allowed empty lists
fun printList(list: List<String>) {
    require(list.size > 0)
    println(list)
}