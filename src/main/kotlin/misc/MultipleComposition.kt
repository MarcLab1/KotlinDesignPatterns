package misc

class Bird {
    fun bok(): Unit {
        println("chick chick")
    }
}

class Fish {
    fun drink(): Unit {
        println("blop")
    }
}

class Fox {
    fun growl(): Unit {
        println("grrrrr")
    }
}

interface IBear {
    fun eatHuman(): Unit
}
class Bear : IBear
{
    override fun eatHuman() {
        print("eat you haha")
    }
}

interface IDogger {
    fun playWithHuman(): Unit
    {
        println("throw me the ball plz ok thx")
    }
}
class Dogger : IDogger
{
    //don't have to override playWIthHuman because it has a default implementation
}

class UglyAnimal(val bird: Bird, val fish: Fish, val fox: Fox) {
    fun doStuff() {
        bird.bok()
        fish.drink()
        fox.growl()
    }
}

class FatBear(private val bear: IBear, private val dogger: IDogger) : IBear by bear, IDogger by dogger {
    fun doStuff() {
        this.eatHuman()
        //bear.eatHuman() //-- also works
        this.playWithHuman()
    }
}

fun main()
{
    val fatBear : FatBear = FatBear(Bear(), Dogger())
    fatBear.doStuff()
}
