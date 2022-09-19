package threads

import kotlinx.coroutines.*
import java.util.*

fun main()
{
    //the result of running an async task is a job
    val job : Job = fastUuidAsync()

    runBlocking {
        val jobWaiting : Deferred<UUID> = fastUuidAsync()
        println(jobWaiting.await())
    }

}