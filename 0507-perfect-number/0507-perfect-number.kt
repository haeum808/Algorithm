class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var sum = 0
        var newNum = num

        for (i in 1..newNum / 2) {
            if (newNum % i == 0) {
                sum += i
            }
        }

        return sum == num
    }
}