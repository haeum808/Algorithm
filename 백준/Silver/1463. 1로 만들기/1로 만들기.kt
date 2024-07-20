import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val dp = IntArray(n + 1)
    dp[1] = 0

    for (i in 2..n) {
        dp[i] = when {
            i % 3 == 0 && i % 2 == 0 -> minOf(dp[i - 1], dp[i / 2], dp[i / 3]) + 1
            i % 3 == 0 -> min(dp[i - 1], dp[i / 3]) + 1
            i % 2 == 0 -> min(dp[i - 1], dp[i / 2]) + 1
            else -> dp[i - 1] + 1
        }
    }

    bw.write("${dp[n]}")
    bw.flush()
    bw.close()
}
