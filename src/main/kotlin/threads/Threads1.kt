package threads

import kotlin.concurrent.thread

fun main()
{
    val numbers : List<Int> = listOf(1,2,3,4,5,6,7,8,9)

    //no guarantee of order
    numbers.forEach { number ->
        thread {
            println(number)
        }
    }
}