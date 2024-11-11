class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0

        for (index in nums.indices) {
            if (nums[index] != `val`) {
                nums[i++] = nums[index ] 
            }
        }

        return i
    }
}