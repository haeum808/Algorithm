class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var startIndex = 0
        var endIndex = nums.size - 1

        while (startIndex <= endIndex) {
            val midIndex = (endIndex + startIndex)/2
            if (nums[midIndex] < target) {
                startIndex = midIndex + 1
            } else if (nums[midIndex] > target) {
                endIndex = midIndex - 1
            } else {
                return midIndex
            }
        }

        return startIndex
    }
}