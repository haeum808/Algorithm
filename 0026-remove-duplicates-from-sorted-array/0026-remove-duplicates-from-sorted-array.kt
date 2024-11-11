class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0

        for (i in 1..<nums.size) {
            if (nums[count] != nums[i]) {
                nums[++count] = nums[i]
            }
        }

        return count + 1
    }
}
