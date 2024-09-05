import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val visited = BooleanArray(n + 13)

    fun backtracking(depth: Int, answer: String) {
        if (depth == n) {
            bw.write("$answer\n")
            return
        }

        for (i in 1..n) {
            if (!visited[i]) {
                visited[i] = true
                backtracking(depth + 1, "$answer$i ")
                visited[i] = false
            }
        }
    }

    backtracking(0, "")

    bw.flush()
    bw.close()
    close()
}
