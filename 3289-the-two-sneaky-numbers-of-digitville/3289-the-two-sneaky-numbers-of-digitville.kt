class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val map = HashMap<Int, Int>()

        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        return map.filter { it.value >= 2 }.keys.toIntArray()
    }
}