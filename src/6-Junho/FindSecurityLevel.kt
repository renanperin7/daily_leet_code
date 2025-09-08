package `6-Junho`

class FindSecurityLevel {
    fun findSecurityLevel(pid: Array<Int>, k: Int): Long {
        var count = 0L
        val n = pid.size

        for (i in 0 until n) {
            var sum = 0
            for (j in i until n) {
                sum += pid[j]
                val length = j - i + 1
                if (sum % k == length) {
                    count++
                }
            }
        }

        return count
    }
}