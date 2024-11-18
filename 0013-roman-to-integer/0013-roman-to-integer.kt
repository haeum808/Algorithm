class Solution {
    val map = hashMapOf<Char, Int>(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000,
    )

    fun romanToInt(s: String): Int {
        var result = 0
        result = result + map[s[s.length - 1]]!!

        for (index in 0..<s.length - 1) {
            if (map[s[index]]!! < map[s[index + 1]]!!) {
                result = result - map[s[index]]!!
            } else {
                result = result + map[s[index]]!!
            }
        }

        return result
    }
}