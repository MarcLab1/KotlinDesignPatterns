package misc

fun main()
{

    val obj1 : Any = Dogger()

    if(obj1 is String) println("ya")
    else if(obj1 is Dogger) println("Avery!")

    (obj1 as Dogger).playWithHuman()
}