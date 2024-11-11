class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val minLengthOfStrs = strs.minOf { it.length }
        var result = ""
        var flag = false

        for (i in 0..<minLengthOfStrs) {
            val set = mutableSetOf<Char>()
            for (j in 0..<strs.size) {
                set.add(strs[j][i])
            }
            
            if (set.size == 1) {
                result += set.first()
                set.clear()
            } else {
                flag = true
                break
            }
        }

        return result
    }
}