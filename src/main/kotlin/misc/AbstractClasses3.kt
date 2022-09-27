package misc

abstract class Utensil(val name : String)
{
    abstract val weight : Double
    var color : String = "Silver"   //mmmm...state!

    fun work1() : String
    {
        return "working"
    }
    abstract fun work2() : String

}

class Fork(val _name : String, ) : Utensil(_name){
    override val weight: Double
        get() = 10.0

    override fun work2(): String {
        return "work man"
    }
}

fun main()
{
    val f1 : Fork = Fork("small fork")
    println(f1.weight.toString())
}