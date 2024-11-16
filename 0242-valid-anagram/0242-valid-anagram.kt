class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (t.length < s.length) return false

        val map = HashMap<Char, Int>()

        for (char in s) {
            map[char] = map.getOrDefault(char, 0) + 1
        }

        for (char in t) {
            if (map[char] == null || map[char]!! == 0) return false

            map[char] = map[char]!! - 1
        }

        return true
    }
}
