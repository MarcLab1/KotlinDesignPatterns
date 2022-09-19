package structural


fun main() {
    val fancyLight : Light = Light("fancyLight")
    val invoker: Invoker = Invoker(
        LightOnCommand(fancyLight),
        LightOffCommand(fancyLight),
        LightDimUpCommand(fancyLight),
        LightDimDownCommand(fancyLight)
    )
}

class Invoker(val on: ICommand, val off: ICommand, val dimUp: ICommand, val dimDown: ICommand) {
}

interface ICommand {
    fun execute()
    fun undoExecute()
}

class LightOnCommand(val light: Light) : ICommand {
    override fun execute() {
        light.on()
    }

    override fun undoExecute() {
        light.off()
    }
}

class LightOffCommand(val light: Light) : ICommand {
    override fun execute() {
        light.off()
    }

    override fun undoExecute() {
        light.on()
    }
}

class LightDimUpCommand(val light: Light) : ICommand {
    override fun execute() {
        light.dimUp()
    }

    override fun undoExecute() {
        light.dimDown()
    }
}

class LightDimDownCommand(val light: Light) : ICommand {
    override fun execute() {
        light.dimDown()
    }

    override fun undoExecute() {
        light.dimUp()
    }
}

class Light(val name: String) {
    fun on(): Unit {}
    fun off(): Unit {}
    fun dimUp(): Unit {}
    fun dimDown(): Unit {}
}