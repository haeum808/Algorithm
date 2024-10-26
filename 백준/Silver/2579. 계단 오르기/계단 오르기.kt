import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val stairs = IntArray(n) { readLine().toInt() }
    val dp = IntArray(n)

    when (n) {
        1 -> {
            dp[0] = stairs[0]
        }
        2 -> {
            dp[0] = stairs[0]
            dp[1] = stairs[0] + stairs[1]
        }
        3 -> {
            dp[0] = stairs[0]
            dp[1] = stairs[0] + stairs[1]
            dp[2] = maxOf(stairs[0] + stairs[2], stairs[1] + stairs[2])
        }
        else -> {
            dp[0] = stairs[0]
            dp[1] = stairs[0] + stairs[1]
            dp[2] = maxOf(stairs[0] + stairs[2], stairs[1] + stairs[2])

            for (i in 3..<n) {
                dp[i] = maxOf(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i])
            }
        }
    }
    
    bw.write("${dp[n - 1]}")
    bw.flush()
    bw.close()
    close()
}
