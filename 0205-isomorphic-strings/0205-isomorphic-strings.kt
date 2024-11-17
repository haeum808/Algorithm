class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map = HashMap<Char, Char>()
        val visited = hashSetOf<Char>()
        
        for (index in s.indices) {
            var char1 = s[index]
            var char2 = t[index]

            if (map.containsKey(char1)) {
                if (map[char1] != char2) return false
            } else {
                if (visited.contains(char2)) return false
                map[char1] = char2
                visited.add(char2)
            }
        }
        return true
    }
}
