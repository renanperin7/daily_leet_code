package `4-Abril`

import kotlin.math.max

class MaximumLengthSubstring {
    fun maximumLengthSubstring(s: String): Int {
        var l = 0
        var r = 0
        var total = 1

        val counter = HashMap<Char, Int>()

        counter[s[0]] = 1

        while (r < s.length - 1) {
            r+= 1

            if (counter.containsKey(s[r])) {
                counter[s[r]] = counter[s[r]]!! + 1
            } else {
                counter[s[r]] = 1
            }
            while (counter[s[r]] == 3) {
                counter[s[l]] = counter[s[l]]!! - 1
                l += 1
            }
            total = max(total, r-l+1)
        }
        return total
    }
}