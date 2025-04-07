package Abril

class RomanToInt {
    fun romanToInt(s: String): Int {
        val romanToIntMap = mutableMapOf<Char, Int>()

        s.forEach { char ->
            romanToIntMap[char] = when (char) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }

        var total = 0
        var prevValue = 0

        for (i in s.indices.reversed()) {
            val currentValue = romanToIntMap[s[i]] ?: 0
            if (currentValue < prevValue) {
                total -= currentValue
            } else {
                total += currentValue
            }
            prevValue = currentValue
        }

        return total
    }
}