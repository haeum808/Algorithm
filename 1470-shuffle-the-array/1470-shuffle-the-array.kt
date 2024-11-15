class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val result = IntArray(nums.size)

        for (i in 0..<nums.size / 2) {
            result[i * 2] = nums[i]
            result[i * 2 + 1] = nums[i + n]
        }

        return result
    }
}