package structural

//used to avoid abusing inheritance

interface Enemy{
    fun attack() : String
    fun move (space : String)
}

class Slime : Enemy{
    override fun attack(): String {
        return "slime attacking"
    }

    override fun move(space: String) {
        println("moving to $space")
    }
}

class Ghost : Enemy{
    override fun attack(): String {
        return "Ghost attacking"
    }

    override fun move(space: String) {
        println("moving to $space")
    }
}