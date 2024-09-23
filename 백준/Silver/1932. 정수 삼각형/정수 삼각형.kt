import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val dp = Array(n) { IntArray(n) }

    for (i in 0..<n) {
        val input = readLine().split(" ").map { it.toInt() }

        for (j in input.indices) {
            dp[i][j] = input[j]
        }
    }

    for (i in n - 1 downTo 1) {
        for (j in 0..<n - 1) {
            dp[i - 1][j] = maxOf(dp[i][j], dp[i][j + 1]) + dp[i - 1][j]
        }
    }

    bw.write("${dp[0][0]}")
    bw.flush()
    bw.close()
    close()
}
