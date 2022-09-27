package misc

val number1: String = "100"
val number2: String
    get() = "9999"

fun main() {
    println(number1.length.toString())
    println(number2.length.toString())

    val list = listOf<Int>(1,2,3)
    if(list is MutableList)
    {
        println("don't do this wtf")
        //list.add(33)
        //println(list)
    }

    val mutableList : MutableList<Int> = list.toMutableList()
    mutableList.add(222)
    println(mutableList.toString())

    val list1 : MutableList<Int> = mutableListOf<Int>(1,2,3,4)
    var list2 : List<Int> = listOf<Int> (4,5,6)

    list1 += 2  //list1.add(2)
    list2 += 2  //list2 = list2 + 2

    println(list1)
    println(list2)
}