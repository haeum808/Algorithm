import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (l, c) = readLine().split(" ").map { it.toInt() }
    val alphabet = readLine().split(" ").sorted()
    val result = mutableListOf<String>()

    fun backtracking(target: String, numberOfVowel: Int, numberOfConsonant: Int, index: Int) {
        if (target.length == l && numberOfVowel >= 1 && numberOfConsonant >= 2) {
            result.add(target)
            return
        }

        for (i in index..<c) {
            val (vowel, consonant) = if ("aeiou".contains(alphabet[i])) 1 to 0 else 0 to 1

            backtracking(target + alphabet[i], numberOfVowel + vowel, numberOfConsonant + consonant, i + 1)
        }
    }

    backtracking("", 0, 0, 0)

    bw.write(result.joinToString("\n"))
    bw.flush()
    bw.close()
    close()
}
