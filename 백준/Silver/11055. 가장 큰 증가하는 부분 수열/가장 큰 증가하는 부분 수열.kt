import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val dp = IntArray(n) { numbers[it] }
    var result = numbers.max()

    for (i in 0..<n) {
        for (j in 0..<i) {
            if (numbers[i] > numbers[j]) {
                dp[i] = maxOf(dp[i], dp[j] + numbers[i])
                result = maxOf(result, dp[i])
            }
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
