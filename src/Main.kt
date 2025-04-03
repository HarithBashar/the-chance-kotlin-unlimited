fun main() {

}


























fun isPalindrome(myWord: String): Boolean {
    val word = myWord.lowercase().filter { it.isLetterOrDigit() }
    var leftPointer = 0
    var rightPointer = word.length - 1
    while (leftPointer < rightPointer) {
        if (word[leftPointer] != word[rightPointer]) return false
        leftPointer++
        rightPointer--
    }
    return true
}


fun fizzBuzzOperator(endValue: Int): List<String> {
    val fizzBuzzList: MutableList<String> = mutableListOf()
    for (num in 1..endValue) {
        fizzBuzzList.addLast(calculateSingeFizzBuzz(num))
    }
    return fizzBuzzList
}

fun calculateSingeFizzBuzz(num: Int): String {
    return when {
        num % 3 == 0 && num % 5 == 0 -> "FizzBuzz"
        num % 3 == 0 -> "Fizz"
        num % 5 == 0 -> "Buzz"
        else -> num.toString()
    }
}

