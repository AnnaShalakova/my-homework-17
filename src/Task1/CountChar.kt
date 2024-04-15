package Task1

fun main() {
    fun countCharacters(inputString: String, targetChar: Char) {
        val count = inputString.count { it == targetChar }

        if (count > 0) {
            println("Количество символов '$targetChar' в строке $inputString == $count")
        } else {
            println("Символ '$targetChar' в строке $inputString не найден")
        }
    }

    countCharacters("Молоко", 'о')
    countCharacters("Молоко", 'а')
}