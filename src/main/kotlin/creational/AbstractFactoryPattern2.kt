package creational

fun main() {
    val bf: BeverageFactory = ConcreteBeverageFactory()
    bf.getCoffee().price
}

interface Coffee {
    val price: Int
}

class Espresso(override val price: Int) : Coffee
class Decaf(override val price: Int) : Coffee

interface Tea {
    val price: Int
}

class EarlGrey(override val price: Int) : Tea
class Green(override val price: Int) : Tea

abstract class BeverageFactory {
    abstract fun getCoffee(): Coffee
    abstract fun getTea(): Tea
}

class ConcreteBeverageFactory : BeverageFactory() {
    override fun getCoffee(): Coffee {
        return Espresso(5)
    }

    override fun getTea(): Tea {
        return EarlGrey(2)
    }

}

