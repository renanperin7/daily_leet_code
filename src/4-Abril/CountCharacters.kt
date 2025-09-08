package `4-Abril`

class CountCharacters {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val charsHashMap = HashMap<Char, Int>()
        var totalLength = 0

        chars.forEach { char ->
            charsHashMap[char] = charsHashMap.getOrDefault(char, 0) + 1
        }

        words.forEach { word ->
            val wordHashMap = HashMap<Char, Int>()
            var isValid = true

            word.forEach { letra ->
                wordHashMap[letra] = wordHashMap.getOrDefault(letra, 0) + 1
            }

            for ((letra, count) in wordHashMap) {
                if (charsHashMap.getOrDefault(letra, 0) < count) {
                    isValid = false
                    break
                }
            }

            if (isValid) {
                totalLength += word.length
            }
        }

        return totalLength
    }
}