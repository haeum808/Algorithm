class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val diff = target - nums[i]

            if (map[diff] != null) {
                return intArrayOf(map[diff]!!, i)
            }
            map[nums[i]] = i
        }

        return intArrayOf(-1, -1)
    }
}
