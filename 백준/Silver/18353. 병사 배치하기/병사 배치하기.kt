import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val warriors = readLine().split(" ").map { it.toInt() }.reversed()
    val dp = IntArray(n) { 1 }

    for (i in 1..<n) {
        for (j in 0..<i) {
            if (warriors[j] < warriors[i]) dp[i] = max(dp[i], dp[j] + 1)
        }
    }

    println(n - dp.max())
    bw.flush()
    bw.close()
    close()
}
