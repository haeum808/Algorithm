class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val patterns = pattern.toCharArray()
        val strings = s.split(" ")

        if (patterns.size != strings.size) return false
        val map = HashMap<Char, String>()
        val visited = hashSetOf<String>()

        for (index in pattern.indices) {
            println(map)

            if (map[pattern[index]] != null) {
                if (map[pattern[index]] != strings[index]) return false
            } else {
                if(visited.contains(strings[index])) return false
                map[pattern[index]] = strings[index]
                visited.add(strings[index])
            }
        }

           return true
    }
}