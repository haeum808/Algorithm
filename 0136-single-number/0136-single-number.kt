class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0

        for (num in nums) {
            result = num xor result
        }
        
        return result
    }
}
