class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0

        for (i in nums.indices) {
            for (j in i + 1..<nums.size) {
                if (nums[i] == nums[j]) result++
            }
        }

        return result
    }
}