class Solution {
    fun isPalindrome(s: String): Boolean {
        var newS = s.lowercase().filter { it in 'a'..'z' || it in '0'..'9' }
        var start = 0
        var end = newS.length - 1

        while (start < end) {
            if (newS[start] == newS[end]) {
                start++
                end--
            } else {
                return false
            }
        }

        return true
    }
}