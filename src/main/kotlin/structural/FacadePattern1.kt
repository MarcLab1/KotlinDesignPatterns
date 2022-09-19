package structural

fun main() {
    val facade: Facade = Facade()
    facade.loadGame(Mode.EASY)
}

enum class Mode {
    EASY,
    HARD,
    VERYHARD
}

interface Game {
    fun loadGame(mode: Mode)
}

class EasyGame : Game {
    override fun loadGame(mode: Mode) {}
}

class HardGame : Game {
    override fun loadGame(mode: Mode) {}
}

class VeryHardGame : Game {
    override fun loadGame(mode: Mode) {}
}

class Facade {
    val easyGame = EasyGame()
    val hardGame = HardGame()
    val veryHardGame = VeryHardGame()

    fun loadGame(mode: Mode) {
        when (mode) {
            Mode.EASY -> easyGame.loadGame(mode)
            Mode.HARD -> hardGame.loadGame(mode)
            Mode.VERYHARD -> veryHardGame.loadGame(mode)
            else -> {}
        }
    }
}

