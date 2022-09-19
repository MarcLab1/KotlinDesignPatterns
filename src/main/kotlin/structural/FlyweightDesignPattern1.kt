package structural

enum class Attack{
    KICK,
    PUNCH;
}

class Enemy3{
    val attackType : Attack = Attack.KICK
    fun getNextAttack() : Attack
    {
       return when (attackType)
       {
           Attack.KICK ->
           {
               Attack.PUNCH
           }

           Attack.PUNCH ->
           {
               Attack.KICK
           }

           else -> {
               throw Exception("I am error")
           }
       }
    }
}