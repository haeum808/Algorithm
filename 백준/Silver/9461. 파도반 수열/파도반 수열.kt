import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val dp = LongArray(101)
    dp[1] = 1
    dp[2] = 1
    dp[3] = 1

    for (i in 4..100) {
        dp[i] = dp[i - 2] + dp[i - 3]
    }

    repeat(n) {
        bw.write("${dp[readLine().toInt()]}\n")
    }

    bw.flush()
    bw.close()
}
