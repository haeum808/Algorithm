class Solution {
    fun hammingWeight(n: Int): Int {
        var copyN = n
        var result = 0

        while (copyN > 0) {
            if (copyN % 2 != 0) result++
            copyN /= 2 
        }

        return result
    }
}