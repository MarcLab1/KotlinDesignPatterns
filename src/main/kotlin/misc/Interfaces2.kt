package misc

interface Hat{
    fun show() : String = "showing hat"
}

interface Cape{
    fun show() : String = "showing cape"
    fun fly() : String
}

class Outfit : Hat, Cape{
    override fun show(): String {
        super<Hat>.show() + "\n" +  return super<Cape>.show()
    }
    override fun fly() = "this outfit can fly"
}

fun main()
{
    val o1 : Outfit = Outfit()
    println(o1.show())
}