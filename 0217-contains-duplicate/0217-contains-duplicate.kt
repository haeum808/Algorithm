class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size != nums.size
    }
}

/*
1. nums -> set
2. nums.size , set.size
2.1 -> same -> no duplicate
2.2 -> not same -> there duplicate
 */
