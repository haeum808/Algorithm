class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = hashSetOf<Int>()

        for (num in nums) {
            if (set.contains(num)) return true
            set.add(num)
        }

        return false
    }
}

/* first think
1. nums -> set
2. nums.size , set.size
2.1 -> same -> no duplicate
2.2 -> not same -> there duplicate
 */

/* second think (not use toSet())
1. set -> check occured 
2. until if i find the num in set return false
 */