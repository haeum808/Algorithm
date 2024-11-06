
class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = true
        var index = digits.size - 1

        while(carry && index >= 0) {
            val plusOne = digits[index] + 1
            digits[index] = if (plusOne > 9) plusOne % 10 else plusOne
            carry = plusOne > 9
            index--
        }

        if (carry) {
            val result = IntArray(digits.size + 1)
            result[0] = 1
            System.arraycopy(digits, 0, result, 1, digits.size)
            return result
        }

        return digits
    }
}