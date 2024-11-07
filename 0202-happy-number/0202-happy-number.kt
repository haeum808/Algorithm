class Solution {
    fun isHappy(n: Int): Boolean {
        var newN = n.toLong()
        val map = HashMap<Long, Boolean>()
        
        while (newN > 1L) {
            newN = newN.toString().sumOf { 
                it.digitToInt() * it.digitToInt().toLong()
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