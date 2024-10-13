import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val dp = IntArray(n) { 1 }

    for (i in 1..<n) {
        for (j in 0..<i) {
            if (numbers[j] < numbers[i]) {
                dp[i] = maxOf(dp[i],dp[j] + 1)
            }
        }
    }

    bw.write("${dp.max()}")
    bw.flush()
    bw.close()
    close()
}
