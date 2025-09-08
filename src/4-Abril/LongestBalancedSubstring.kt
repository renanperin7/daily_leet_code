package `4-Abril`

class LongestBalancedSubstring {
    fun findTheLongestBalancedSubstring(s: String): Int {
        var maxLen = 0
        var i = 0
        val n = s.length

        while (i < n) {
            var zeros = 0
            var ones = 0

            while (i < n && s[i] == '0') {
                zeros++
                i++
            }

            while (i < n && s[i] == '1') {
                ones++
                i++
            }

            val currentLen = minOf(zeros, ones) * 2
            maxLen = maxOf(maxLen, currentLen)
        }

        return maxLen
    }
}