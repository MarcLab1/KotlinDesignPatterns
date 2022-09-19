package misc

interface Dog {
    fun bark(): Unit {
        println("barking")
    }
}

interface Cat {
    fun meow(): Unit {
        println("meow")
    }
}

interface Rabbit {
    fun hop(): Unit {
        println("hop hop hop")
    }
}

open class Duck() {
    open fun quack(): Unit {
        println("quack quack")
    }
}

open class SuperAnimal() : Dog, Cat, Rabbit, Duck() {
    override fun quack() {
        println("thou shall not quack")
    }
}

fun main() {
    val dave = SuperAnimal()
    dave.bark()
    dave.meow()
    dave.hop()
}