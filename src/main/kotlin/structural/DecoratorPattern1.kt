package structural

fun main()
{
    val dec : DecoratorClass = DecoratorClass(SomeClassImpl())
    dec.putThing("goodbye")
    println(dec.getThing("goodbye"))
}

interface SomeClass{
    fun getThing(name : String) : Int
    fun putThing(name : String)
}

class SomeClassImpl() : SomeClass
{
    private val map = mutableMapOf("1" to 1, "hello" to 2)

    override fun getThing(name : String): Int {
        return map[name] ?: 0
    }

    override fun putThing(name: String) {
        map[name] = map.size+1
    }
}

/*The by-clause indicates that repo will be stored internally in objects of SomeClass
and the compiler will generate all the methods of Base that forward to repo.
So we can call methods directly with methodName() instead of repo.methodName() */

class DecoratorClass(private val repo: SomeClass) : SomeClass by repo
{
    override fun getThing(name: String): Int {
        println("override get")
        return getThing(name)
    }

    override fun putThing(name: String) {
        println("override put")
        putThing(name)
    }
}

