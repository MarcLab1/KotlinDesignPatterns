package creational

fun main() {
    val notation: List<String> = listOf("k12", "q44", "p23")  
    val gameState = Piece.loadGame(notation)
}

sealed class Piece(val type: String, val col: Int, val row: Int) {
    class Pawn(type: String, col: Int, row: Int) : Piece(type, col, row)
    class Queen(type: String, col: Int, row: Int) : Piece(type, col, row)
    class King(type: String, col: Int, row: Int) : Piece(type, col, row)

    companion object {
        fun loadGame(notation: List<String>): List<Piece> {
            return notation.map { notation ->
                val (type, r, c) = notation.toCharArray()
                val row = r.digitToInt()
                val col = c.digitToInt()
                when (type) {
                    'p' -> Pawn("p", col, row)
                    'q' -> Queen("q", col, row)
                    'k' -> King("k", col, row)
                    else -> throw Exception("I am error")
                }
            }
        }
    }
}