class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = intArrayOf(-1, -1)

        for (i in 0..<nums.size) {
            for (j in i + 1..<nums.size) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i
                    result[1] = j
                    break
                }
            }

            if (result[0] != -1) break
        }

        return result
    }
}