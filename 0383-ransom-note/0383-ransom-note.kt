class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = HashMap<Char, Int>()

        for (char in magazine) {
            map[char] = map.getOrDefault(char, 0) + 1
        }

        for (char in ransomNote) {
            if (map[char] == null || map[char]!! <= 0) return false

            map[char] = map.getOrDefault(char, 0) - 1
        }

        return true
    }
}