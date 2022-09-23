package misc

fun main()
{

    val t1 : MyThing = MyThing()
    println(t1.count.toString())
    t1.addToCount(1)
    t1.addToCount(5)
    println(t1.count.toString())
}

abstract class Thing()
{
    var count : Int = 0
    fun addToCount(amount : Int) : Unit
    {
        count +- amount
    }
}

class MyThing : Thing(){

}