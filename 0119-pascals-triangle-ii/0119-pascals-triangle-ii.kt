class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val pascals = mutableListOf<List<Int>>()
        val result = mutableListOf<Int>()

        for (i in 0..rowIndex) {
            val row = MutableList(i + 1) { 1 } 
            for (j in 1 until i) {
                row[j] = pascals[i - 1][j - 1] + pascals[i - 1][j]
            }

            pascals.add(row)
        }

        return pascals[rowIndex]
    }
}
