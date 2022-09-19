package creational

fun main()
{
    var thing1 = Thing("MLab1", 1)
    thing1 = thing1.copy("Barky", )
    print(thing1.toString())
}

data class Thing(val name : String, val number : Int)