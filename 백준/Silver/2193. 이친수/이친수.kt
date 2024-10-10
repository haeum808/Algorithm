import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val dp = LongArray(90 + 1)

    dp[1] = 1
    dp[2] = 1

    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    bw.write("${dp[n]}")
    bw.flush()
    bw.close()
    close()
}
