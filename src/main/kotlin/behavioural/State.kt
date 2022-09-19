package behavioural

fun main()
{

}

sealed class Mood{
    object Happy : Mood()
    object Sad : Mood()
}

interface Enemy{
    val name : String
    fun attack() : Unit
    fun getMood() : String
}

class Blob : Enemy
{
    var mood: Mood = Mood.Happy

    override val name: String
        get() = "Blob"

    override fun attack(): Unit{
        println("$name attacking")
    }

    override fun getMood() : String{
        return when(mood)
        {
            is Mood.Happy -> "Happy"
            is Mood.Sad -> "Sad"
            else -> throw Exception("I am error")
        }
    }
}