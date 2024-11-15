class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var result = 0

        for (operation in operations) {
            if (operation[1] == '-') result--
            else result++
        }

        return result
    }
}