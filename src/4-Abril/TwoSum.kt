package `4-Abril`

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashmap = HashMap<Int, Int>()

        for ((i, num) in nums.withIndex()) {
            val complement = target - num

            if (hashmap.containsKey(complement)) {
                return intArrayOf(hashmap[complement]!!, i)
            }

            hashmap[num] = i
        }

        return intArrayOf()
    }

    /*
    * Input: nums = [2,7,11,15], target = 9
    * Output: [0,1]
    * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    */
}