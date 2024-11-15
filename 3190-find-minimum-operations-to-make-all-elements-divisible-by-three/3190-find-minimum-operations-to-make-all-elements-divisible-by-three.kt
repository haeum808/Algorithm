class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var count = 0

        for (num in nums) {
            if (num % 3 == 0) continue

            count++
        }

        return count
    }
}