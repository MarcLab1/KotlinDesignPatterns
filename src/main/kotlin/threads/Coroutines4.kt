package threads

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

fun main()
{

    val scope = CoroutineScope(CoroutineName("My Scope"))
    val job1 = scope.launch {
        println(this.coroutineContext)
        launch {
            println(this.coroutineContext)
        }
    }
    //Thread.sleep(1000L)

  //  job1. do stuff ()

}