import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val isVisited = BooleanArray(n + 1)

    fun backtracking(depth: Int, answer: String, start: Int) {
        if (depth == m) {
            println(answer)
            return
        }

        for (number in start..n) {
            if (!isVisited[number]) {
                isVisited[number] = true
                backtracking(depth + 1, "$answer$number ", number)
                isVisited[number] = false
            }
        }
    }

    backtracking(0, "", 1)

    bw.flush()
    bw.close()
    close()
}
