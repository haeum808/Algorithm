class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = nums.toSet().toList()

        for(i in set.indices) {
            nums[i] = set[i]
        }

        return set.size
    }
}