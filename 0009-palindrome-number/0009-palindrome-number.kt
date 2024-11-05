class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x == 0) return true
        if (x < 0) return false
        if (x.mod(10) == 0) return false
        
        var first = x
        var revert = 0

        while (first > revert) {
            revert = revert * 10 + first.mod(10)
            first /= 10
        }

        return first == revert || first == revert / 10
    }
}