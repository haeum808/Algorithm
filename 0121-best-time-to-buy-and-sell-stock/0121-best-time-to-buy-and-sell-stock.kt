class Solution {
    fun maxProfit(prices: IntArray): Int {
        var curMin = 100_000
        var result = 0

        for (i in 0..<prices.size) {
            if (curMin > prices[i]) {
                curMin = prices[i]
            }

            if (result < prices[i] - curMin) {
                result = prices[i] - curMin
            }
        }

        return result
    }
}
