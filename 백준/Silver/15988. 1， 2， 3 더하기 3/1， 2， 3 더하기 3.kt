import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    val dp = LongArray(1_000_001)
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4..1_000_000) {
        dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1_000_000_009
    }

    repeat(t) {
        bw.write("${dp[readLine().toInt()]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
