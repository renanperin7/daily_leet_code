package `6-Junho`

class MinimumSets {
    fun minimumSets(a: Array<Int>, b: Array<Int>, k: Int): Int {
        val n = a.size
        val intervals = Array(n) { i -> intArrayOf(a[i], b[i]) }

        intervals.sortBy { it[0] }

        val gaps = mutableListOf<IntArray>()
        var currentEnd = intervals[0][1]

        for (i in 1 until n) {
            if (intervals[i][0] > currentEnd) {
                gaps.add(intArrayOf(currentEnd, intervals[i][0]))
            }
            currentEnd = maxOf(currentEnd, intervals[i][1])
        }

        if (gaps.isEmpty()) return 1

        var minSets = gaps.size + 1

        for (gap in gaps) {
            val gapLength = gap[1] - gap[0]
            if (gapLength <= k) {
                minSets = minOf(minSets, gaps.size)
            }
        }

        return minSets
    }
}