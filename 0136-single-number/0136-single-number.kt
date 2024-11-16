class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map = HashMap<Int, Int>()

        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        for (v in map) {
            if (v.value == 1) return v.key
        }

        return -1
    }
}

/* 
Time Complexity O(N)
Space Complexity O(1)


 */