package misc

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlin.time.measureTime

@OptIn(DelicateCoroutinesApi::class)
fun main() {

    val myString1 = buildString {
        append("abcabcaabbcc")
        //press ctrl - space to invoke completion (this in our case)
    }

    val flow1 = flow {
        emit(1)
    }

    GlobalScope.launch {
        flow1.collect { value ->   //ctrl-space does the auto complete here

        }
    }

    val subString1 = myString1.subSequence(IntRange(0, 2))

    val (s1, s2) = myString1.partition { it == 'a' }
    println(s1)
    println(s2)

}