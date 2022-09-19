package dataflow

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

fun main() {
    //when 2 coroutines need to talk to each other

    val channel1 = Channel<Int>()

    GlobalScope.launch {
        for (c in channel1) {
            println(c)
        }
    }

    GlobalScope.launch {
        (1..10).forEach {
            channel1.send(it)
        }
        channel1.close()
    }
    Thread.sleep(1000L)

}