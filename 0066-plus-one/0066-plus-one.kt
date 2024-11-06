class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var isCarry = true
        var index = digits.size - 1

        while (isCarry && index >= 0) {
            digits[index] = (digits[index] + 1) % 10
            isCarry = digits[index] == 0
            index--
        }
        
        return if (isCarry) {
            IntArray(digits.size + 1).apply {
                this[0] = 1
                digits.copyInto(this, 1)
            }
        } else {
            digits
        }
    }
}