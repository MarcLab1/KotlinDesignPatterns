package misc

//General - Generalization
//Open classes by default duh

abstract class Music{
    companion object{
        val ending : String = "ok!"
    }
    val station : String = "98.1"
    abstract val trans : String
    open val prans : String = "haha"

    fun play() : String{
        return "lallalalalal"
    }
}

class RapMusic : Music()
{
    override val trans: String = "NYC"
    override val prans: String
        get() = "${super.prans} emldjf"

    init {
        println("${play()} on station $station $ending $prans")
    }
}

fun main()
{
    val rapMusic : RapMusic = RapMusic()
}