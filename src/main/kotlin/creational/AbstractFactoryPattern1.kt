interface Enemy {
    fun attack(): String
}

abstract class EnemyFactory {
    abstract fun getEnemy(): Enemy
}

class Robot : Enemy {
    companion object Factory : EnemyFactory() {
        override fun getEnemy(): Enemy {
            return Robot()
        }
    }
    override fun attack(): String = "robot attacking..."
}

class Slime : Enemy {
    companion object Factory : EnemyFactory() {
        override fun getEnemy(): Enemy {
            return Slime()
        }
    }
    override fun attack(): String = "slime attacking..."
}
