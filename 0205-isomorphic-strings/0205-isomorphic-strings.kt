class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val counterS = IntArray(128)
        val counterT = IntArray(128)

        for (index in 0 until s.length) {
            val currentS = s[index]
            val currentT = t[index]

            if (counterS[currentS.code] != counterT[currentT.code]) return false

            counterS[currentS.code] = index + 1
            counterT[currentT.code] = index + 1
        }
        
        return true
    }
}