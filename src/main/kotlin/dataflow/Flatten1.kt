package dataflow

fun main()
{
    val list1 = listOf<Int>(1,2,3,4)
    val list2 = listOf<Int>(10, 11, 12)

    val listOfLists = listOf<List<Int>>(list1, list2)
    println(listOfLists)

    val listFlat = listOfLists.flatMap { it }
    println(listFlat)
}