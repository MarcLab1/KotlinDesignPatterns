package functionalprogramming

interface Animal

class Duck : Animal{}
class Cat : Animal{}
class Something : Animal

fun main() {
    val animal1 = Duck()
    val animal2 = Cat()
    val animal3 = Something()
    println(whatIsAnimal(animal1))
    println(whatIsAnimal(animal2))
    println(whatIsAnimal(animal3))

}

fun whatIsAnimal(animal : Animal) : String
{
    when (animal)
    {
        is Duck -> { return (animal as Duck).toString()}
        is Cat -> { return (animal as Cat).toString()}
        else -> { return "??"}
    }
}