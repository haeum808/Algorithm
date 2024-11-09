class Solution {
    fun majorityElement(nums: IntArray): Int {
    var hashMapEl: HashMap<Int, Int> = HashMap<Int, Int>()
    var maxValue = 0
    var key: Int = 0
//Check that array is less that 3
    if (nums.size == 1 || nums.size == 2) {
        key = nums[0]
    } else {
        for (i in nums) {
            var count = 1
//If the element is found in the array first time add it in hash map as key and give the value one, because it find only once. Else increment value*
            if (!hashMapEl.containsKey(i)) {
                hashMapEl[i] = 1
            } else {
                hashMapEl[i] = (hashMapEl[i] ?: 1) + 1
            }
        }
// Find the max element in hash map's values, it will be the the largest number of repetitions in the array */
        maxValue = hashMapEl.values.maxOrNull()!!
// Find the key of this value and it we be the majority element 
        key = hashMapEl.entries.find { it.value == maxValue }?.key!!
    }
    return key
    }
}