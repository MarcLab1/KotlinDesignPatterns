package behavioural

fun main()
{

    var history : History = History()
    var thing = Thing("Bill")
    history.push(ThingState(thing.name))

    thing.name = "tony"
    history.push(ThingState(thing.name))

    thing.name = "nancy"
    history.push(ThingState(thing.name))

    thing.name = "Chucky"
    thing.restore(history.pop())
    println(thing.name)
    thing.restore(history.pop())
    println(thing.name)
}

//Originator
data class Thing(var name : String)
{
    fun restore(thingState: ThingState)
    {
        name = thingState.name
    }
}

//Memento
data class ThingState(val name : String)

//Caretaker
class History(things: List<ThingState> = emptyList())
{
    private val list : MutableList<ThingState> = mutableListOf()
    init {
        list.addAll(things)
    }
    fun push(thingState : ThingState)
    {
        list.add(thingState)
    }

    fun pop() : ThingState
    {
        return list.removeLast()
    }
}

