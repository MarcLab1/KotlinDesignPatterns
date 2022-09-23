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

class Fork(val _name : String) : Utensil(_name){
    override val weight: Double
        get() = 12.2

    override fun work2(): String {
        return "work man"
    }

}