class Solution {
    val dp = IntArray(46)

    fun climbStairs(n: Int): Int {
        dp[1] = 1
        dp[2] = 2
        return climb(n)
    }

    fun climb(n: Int): Int {
        if (dp[n] != 0) {
            return dp[n]
        }
        val first = climb(n - 1)
        val second = climb(n - 2)
        val result = first + second
        dp[n] = result
        return dp[n]
    }
}