class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = List(numRows) { IntArray(it + 1) { 1 } }

        for (i in 1..<result.size) {
            for (j in 1..<result[i].size - 1) {
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j]
            }
        }

        return result.map { it.toList() }
    }
}