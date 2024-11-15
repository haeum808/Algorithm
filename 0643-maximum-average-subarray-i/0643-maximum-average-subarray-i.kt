class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var maxAverage = -10_001.0

        for (i in 0..nums.size - k) {
            var temp = 0

            for (j in i..<i + k) {
                temp += nums[j]
            }

            maxAverage = maxOf(maxAverage, temp.toDouble() / k)
        }

        return maxAverage
    }
}