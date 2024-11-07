class Solution {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        var findNotBlank = false

        for (i in s.length - 1 downTo 0) {
            if (findNotBlank && s[i] == ' ') break

            if (s[i] != ' ') {
                findNotBlank = true
                count++
            }
        }

        return count
    }
}