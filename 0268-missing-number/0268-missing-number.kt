class Solution {
    fun missingNumber(nums: IntArray): Int {
        val numbers = IntArray(nums.size + 1)

        for (num in nums) {
            numbers[num] += 1
        }
        
        for (index in numbers.indices) {
            if (numbers[index] == 0) {
                return index
            }
        } 

        return nums.size + 1
    }
}

/*
1. IntArray(num.size)
2. nums -> IntArray[index] += 1
2.1. IntArray return if this value 0 -> return index
2.2. if there no value 0 -> return num.size + 1
 */