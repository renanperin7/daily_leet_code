package `4-Abril`

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (num in nums) {
            result = result xor num
        }
        return result
    }
}