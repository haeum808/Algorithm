import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    repeat(n) {
        val words = readLine().toCharArray().sorted()
        val visited = BooleanArray(words.size)
        val result = StringBuilder()

        fun backtracking(depth: Int) {
            if (depth == words.size) {
                bw.write("$result\n")
                return
            }

            var prevChar: Char? = null
            for (i in words.indices) {
                if (visited[i].not() && words[i] != prevChar) {
                    visited[i] = true
                    result.append(words[i])
                    backtracking(depth + 1)
                    result.deleteCharAt(result.lastIndex)
                    visited[i] = false
                    prevChar = words[i]
                }
            }
        }

        backtracking(0)
    }

    bw.flush()
    bw.close()
    close()
}
