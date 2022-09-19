package threads

import kotlinx.coroutines.runBlocking

fun main()
{
    runBlocking {
        println("hello")
        println("world")
    }
    //Thread.sleep(1000L) -- we don't need this
}