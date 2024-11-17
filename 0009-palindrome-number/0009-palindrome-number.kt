class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false

        var reverseX = 0L
        var newX = x

        while (x > reverseX) {
            reverseX = 10 * reverseX + newX % 10
            newX /= 10
        }
 
        return x.toLong() == reverseX
    }
}
