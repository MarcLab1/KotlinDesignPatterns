package creational

fun main()
{
    DoThings.doSomething(2)
}

object DoThings {
    var number : Int? = null

    init {
        println("singleton invoked")
        number = number //variable shadowing
    }

    fun doSomething(number :Int) : Unit
    {
        println("something is being done???")
    }
}