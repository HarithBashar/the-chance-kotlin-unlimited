package month_1.w1_sudoku_app

fun main() {

}

// sudoku.any if "one" true
// sudoku.all if "all" true

fun sudokuChecker(sudoku: List<List<Char>>): Boolean {
    val empty = '-'
    val valid = ('1'..'9').toSet()

    if (sudoku.size != 9 || sudoku.any { it.size != 9 }) return false

    val rowsValid = sudoku.all { row ->
        val seen = mutableSetOf<Char>()
        row.all { c -> c == empty || (c in valid && seen.add(c)) }
    }

    val colsValid = (0 until 9).all { col ->
        val seen = mutableSetOf<Char>()
        (0 until 9).all { row ->
            val c = sudoku[row][col]
            c == empty || (c in valid && seen.add(c))
        }
    }
    if (!rowsValid || !colsValid) return false

    val boxesLineOne: MutableList<Char> = mutableListOf()
    val boxesLineTwo: MutableList<Char> = mutableListOf()
    val boxesLineThree: MutableList<Char> = mutableListOf()
    for (i in 0..8) {
        if (i == 3 || i == 6) {
            boxesLineOne.clear()
            boxesLineTwo.clear()
            boxesLineThree.clear()
        }
        if (sudoku[0][i] != empty && boxesLineOne.contains(sudoku[0][i])) return false else boxesLineOne.add(sudoku[0][i])
        if (sudoku[1][i] != empty && boxesLineOne.contains(sudoku[1][i])) return false else boxesLineOne.add(sudoku[1][i])
        if (sudoku[2][i] != empty && boxesLineOne.contains(sudoku[2][i])) return false else boxesLineOne.add(sudoku[2][i])

        if (sudoku[3][i] != empty && boxesLineTwo.contains(sudoku[3][i])) return false else boxesLineTwo.add(sudoku[3][i])
        if (sudoku[4][i] != empty && boxesLineTwo.contains(sudoku[4][i])) return false else boxesLineTwo.add(sudoku[4][i])
        if (sudoku[5][i] != empty && boxesLineTwo.contains(sudoku[5][i])) return false else boxesLineTwo.add(sudoku[5][i])

        if (sudoku[6][i] != empty && boxesLineThree.contains(sudoku[6][i])) return false else boxesLineThree.add(sudoku[6][i])
        if (sudoku[7][i] != empty && boxesLineThree.contains(sudoku[7][i])) return false else boxesLineThree.add(sudoku[7][i])
        if (sudoku[8][i] != empty && boxesLineThree.contains(sudoku[8][i])) return false else boxesLineThree.add(sudoku[8][i])

    }

    return true
}
