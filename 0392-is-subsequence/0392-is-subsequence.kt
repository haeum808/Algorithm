class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var index1 = 0

        for (index2 in 0..<t.length) {
            if (index1 >= s.length) break 
            
            if (t[index2] == s[index1]) {
                index1++

            }
        }

        return index1 == s.length
    }
}