class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) return strs[0]

        val target = strs[0]

        for (i in 0..<target.length) {
            for (k in 1..<strs.size) {
                if (strs[k].length <= i || target[i] != strs[k][i]) {
                    return target.substring(0, i)
                }
            }
        }

        return target
    }
}
