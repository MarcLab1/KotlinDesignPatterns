package functionalprogramming

import kotlin.reflect.typeOf

fun main()
{

    var p1 = "a" to 1
    // p1.first = "hello"   --Pairs are immutable

    p1 = "b" to 13

    val (key,value) = p1
    println("the key is $key and the value is $value")

    val p2 = Pair(1, "Robert")
    val t1 = Triple(1, "Roberto", "Alomar")

    println(t1)

}
