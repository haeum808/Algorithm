class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val map = HashMap<Int, Int>()
        val result = IntArray(2)
        var index = 0

        for (num in nums) {
            if (map.containsKey(num)) result[index++] = num
            else map[num] = num
        }

        return result
    }
}
