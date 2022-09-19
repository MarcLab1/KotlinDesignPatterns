package dataflow

fun main()
{
    val numbers : List<Int> = listOf(1,2,3)

    val sum = numbers.reduce({sum,c -> sum + c} )
    println(sum)
}