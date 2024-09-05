import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine().split(" ").map { it.toInt() }

        if (input[0] == 0) break

        val k = input[0]
        val numbers = input.slice(1..<input.size)
        val visited = BooleanArray(numbers.size + 1)

        fun backtracking(depth: Int, answer: String, index: Int) {
            if (depth == 6) {
                bw.write("$answer\n")
                return
            }

            for (i in index..<numbers.size) {
                if (!visited[i]) {
                    visited[i] = true
                    backtracking(depth + 1, "$answer${numbers[i]} ", i + 1)
                    visited[i] = false
                }
            }
        }

        backtracking(0, "", 0)

        bw.write("\n")
    }

    bw.flush()
    bw.close()
    close()
}
