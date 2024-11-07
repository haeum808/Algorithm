class Solution {
    fun isHappy(n: Int): Boolean {
        var newN = n.toInt()
        val map = HashMap<Int, Boolean>()
        
        while (newN > 1) {
            newN = newN.toString().sumOf { 
                it.digitToInt() * it.digitToInt()
            }
            
            if (map[newN] == null) {
                map[newN] = true
            } else {
                return false
            }
        }
        
        return true
    }
}
