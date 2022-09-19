//aka Factory Method

fun main() {

    val shapes = listOf<Shape>(Shape.Hexagon, Shape.Triangle("3"), Shape.Square("all 4 man"))
    shapes.map { Shape.getColorForShape(it) }
        .forEach{
        println(it.toString())
    }
}

sealed class Shape(description: String?) {
    companion object {
        fun getColorForShape(shape: Shape) : MyColor
        {
            return when (shape)
            {
                is Shape.Triangle -> MyColor(255,0,0)
                is Shape.Square -> MyColor(0,255,0)
                is Shape.Hexagon -> MyColor(0,0,255)
                else -> MyColor(100,100,100)
            }
        }
    }

    data class Triangle(val description: String) : Shape(description)
    class Square(description: String) : Shape(description)
    object Hexagon : Shape(null)
}

data class MyColor (val r:Int, val g: Int, val b: Int)
