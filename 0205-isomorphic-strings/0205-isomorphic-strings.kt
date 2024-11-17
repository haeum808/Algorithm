class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map1 = HashMap<Char, Int>()
        val map2 = HashMap<Char, Int>()
        var index = 0

        while (index < s.length) {
            if (map1[s[index]] == null && map2[t[index]] == null) {
                map1[s[index]] = index
                map2[t[index]] = index
            }

            if (map1[s[index]] != map2[t[index]]) return false

            while(map1[s[index]] != map2[t[index]]) {
                index++
                continue    
            }

            index++
        }

        return true
    }
}