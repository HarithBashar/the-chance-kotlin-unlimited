package month_1.w1_sudoku_app

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    val delayM: Long = 300

    check(
        name = "Should return True, When valid sudoku board but not filled",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9'),
            )
        ),
        correctResult = true
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return False, When row has duplicated number",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('2', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9'),
            )
        ),
        correctResult = false
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return False, When column has duplicated number",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '6', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '-', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '-', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '3', '-', '-', '8', '-', '-', '7', '9'),
            )
        ),
        correctResult = false
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return False, When 3rd box field has duplicated number",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '6', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '9', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9'),
            )
        ),
        correctResult = false
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return False, When board contains an invalid characters",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', 'X', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9'),
            )
        ),
        correctResult = false
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return True, When completed filled valid sudoku board",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                listOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                listOf('3', '4', '5', '2', '8', '6', '1', '7', '9'),
            )
        ),
        correctResult = true
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return False, When board has more than 9 columns",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-', '-'),
                listOf('-', '9', '-', '-', '-', '-', '-', '6', '-', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3', '-'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1', '-'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6', '-'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '*', '5', '-'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9', '-'),
            )
        ),
        correctResult = false
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return False, When board has more than 9 Rows",
        result = sudokuChecker(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '-', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '*', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            )
        ),
        correctResult = false
    )
    runBlocking { delay(delayM) }
    check(
        name = "Should return True, When empty sudoku board",
        result = sudokuChecker(
            listOf(
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
            )
        ),
        correctResult = true
    )
}

fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) println("Success ✅: $name")
    else println("Failed  🚫: $name")
}
