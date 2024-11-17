class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val alphabetCount1 = IntArray(26)
        val alphabetCount2 = IntArray(26)

        for (char in magazine) {
            alphabetCount1[char - 'a']++
        }

        for (char in ransomNote) {
            alphabetCount2[char - 'a']++
        }

        for (char in ransomNote) {
            if (alphabetCount1[char - 'a'] < alphabetCount2[char - 'a']) return false
        }

        return true
    }
}