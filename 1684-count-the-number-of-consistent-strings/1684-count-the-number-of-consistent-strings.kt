class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var result = words.size

        for (word in words) {
            for (i in word.indices) {
                if (allowed.contains(word[i]).not()) {
                    result--
                    break
                }
            }
        }

        return result
    }
}