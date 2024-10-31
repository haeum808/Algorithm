import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { readLine().split(" ").map { it.toInt() } }
    val dp = Array(n + 1) { IntArray(n + 1) }

    for (i in 1..n) {
        for (j in 1..n) {
            dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + graph[i - 1][j - 1]
        }
    }

    repeat(m) {
        val (x1, y1, x2, y2) = readLine().split(" ").map { it.toInt() }

        bw.write("${dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
