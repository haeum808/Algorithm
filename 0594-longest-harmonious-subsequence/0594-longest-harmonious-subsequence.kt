class Solution {
    fun findLHS(nums: IntArray): Int {
        var result = 0
        val map = mutableMapOf<Int, Int>()

        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        for (key in map.keys) {
            if (map[key + 1] != null) {
                result = max(result, map[key]!! + map[key + 1]!!)
            }
        }

        return result
    }
}