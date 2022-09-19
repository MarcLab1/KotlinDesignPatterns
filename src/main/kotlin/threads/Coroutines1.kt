package threads

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

fun main() {

    println(fastUuidAsync())

    GlobalScope.launch {

        delay(100) //suspend method that puts the thread to sleep

        //returns nothing
    }
}

fun fastUuidAsync() = GlobalScope.async {
    UUID.randomUUID()
}
