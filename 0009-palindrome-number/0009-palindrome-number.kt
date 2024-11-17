class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val xString = "$x"

        for (index in 0..<xString.length) {
            if (xString[index] != xString[xString.length - index - 1]) return false
        }
 
        return true
    }
}