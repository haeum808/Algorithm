class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var max = Int.MIN_VALUE
        var sum = 0
        for (i in 0..<k) {
            sum += nums[i]
        }
        max = sum

        for (i in k..<nums.size) {
            sum = sum + nums[i] - nums[i - k]

            if (sum > max) max = sum
        }

        return max / k.toDouble()
    }
}