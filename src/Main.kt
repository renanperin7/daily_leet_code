fun main() {
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

    println(findTheLongestBalancedSubstring("00111011110001011"))


    fun twoSum(nums: IntArray, target: Int): IntArray {

        nums.

        return intArrayOf(0, 1)
    }

    /*
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    */
}