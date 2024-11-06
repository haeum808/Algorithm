class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val plusOneDigits = IntArray(digits.size + 1)
        var over = 1

        for (i in digits.size - 1 downTo 0) {
            plusOneDigits[i + 1] = (digits[i] + over) % 10

            over = (digits[i] + over) / 10
        }

        return if (over == 1) {
            plusOneDigits[0] = 1
            plusOneDigits
        } else {
            plusOneDigits.slice(1..digits.size).toIntArray()
        }
    }
}