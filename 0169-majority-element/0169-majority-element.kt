class Solution {
    
    fun majorityElement(nums: IntArray): Int {
        nums.sort()
        var prevNum = Int.MAX_VALUE
        var targetSize = nums.size / 2
        var count = 0

        for (index in nums.indices) {
            if (prevNum == nums[index]) {
                count++
            } else {
                prevNum = nums[index]
                count = 0
            }

            if (count >= targetSize) return nums[index]
        }

        return -1
    }
}