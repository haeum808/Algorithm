class Solution {
    fun buildArray(nums: IntArray): IntArray {
        for (i in nums.indices) {
            val value = nums[i]
            val newValue = nums[value] % 1_000_000
            nums[i] = (1_000_000 * newValue) + value
        }

        for (i in nums.indices) {
            nums[i] /= 1_000_000
        }

        return nums
    }
}
