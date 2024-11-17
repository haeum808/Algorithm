class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        var result = mutableListOf<String>()

        if (nums.size == 1) {
            result.add("${nums[0]}")
            return result
        }

        var index = 0

        while (index < nums.size) {
            val start = nums[index]
            while (index < nums.size - 1 && nums[index + 1] - nums[index] == 1) {
                index++
            }
            if (nums[index] == start) {
                result.add("${nums[index]}")
            } else {
                result.add("$start->${nums[index]}")
            }
            index++
        }

        return result
    }
}
