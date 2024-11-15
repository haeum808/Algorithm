class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = 0

        for (account in accounts) {
            max = maxOf(max, account.sum())
        }

        return max
    }
}