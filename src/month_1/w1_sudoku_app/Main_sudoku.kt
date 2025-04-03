package month_1.w1_sudoku_app

fun main() {
    print("hello world")
}

// very big O(n^2 + n^2)
fun sudokuChecker(sudoku: List<List<Char>>): Boolean {
    val emptyField = '-'
    val validChars: List<Char> = listOf('1', '2', '3', '4', '5', '6', '7', '8', '9')

    if (sudoku.size != 9) return false // check columns size
    for (list in sudoku.indices) {
        if (sudoku[list].size != 9) return false // check rows size

        // check row duplication
        val seenRowChars: MutableList<Char> = mutableListOf();
        for (char in sudoku[list]) {
            if (char == emptyField) continue
            if (!validChars.contains(char)) return false
            if (seenRowChars.contains(char)) {
                return false
            } else {
                seenRowChars.add(char)
            }
        }
    }
    // check column duplication
    val seenColumnChars: MutableList<Char> = mutableListOf();
    for (column in 0..8) {
        for (row in sudoku.indices) {
            val char: Char = sudoku[row][column]
            if (char == emptyField) continue
            if (seenColumnChars.contains(char)) {
                return false
            } else {
                seenColumnChars.add(char)
            }
        }
        seenColumnChars.clear()
    }

    return true
}