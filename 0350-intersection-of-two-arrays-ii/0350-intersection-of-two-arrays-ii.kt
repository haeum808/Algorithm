class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val numberOfNum = IntArray(1001)
        val result = mutableListOf<Int>()

        for (num in nums1) {
            numberOfNum[num] += 1
        }

        for (num in nums2) {
            if (numberOfNum[num] > 0) {
                result.add(num)
                numberOfNum[num] -= 1
            }
        }

        return result.toIntArray()
    }
}

/*
1. numberOfNum (Array)
2. nums1 -> i find num increase
3. nums2 -> i find smae thing -> 0 -> add to result -> minus size of num
4. return result
 */