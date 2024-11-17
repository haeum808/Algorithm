class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.size == 0) return listOf()

        var result = mutableListOf<String>()
        var start = Int.MIN_VALUE
        var end = Int.MIN_VALUE
        var index = 0

        while (index < nums.size - 1) {
            if (nums[index] == nums[index + 1] - 1) {
                start = nums[index]
                end = nums[index + 1]

                index += 1

                while (index < nums.size - 1 && nums[index] == nums[index + 1] - 1) {
                    end += 1
                    index++
                }

                result.add("$start->$end")
                index++
            } else {
                start = nums[index++]
                result.add("$start")
            }
        }

        if (end != nums[nums.size - 1]) {
            result.add("${nums[nums.size - 1]}")
        }

        return result
    }
}