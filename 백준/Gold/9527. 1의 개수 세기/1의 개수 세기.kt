import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.ln

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val dp = LongArray(55)

    fun countOne(n: Long): Long {
        var newN = n
        var count = newN and 1L
        val size = (ln(newN.toDouble()) / ln(2.0)).toInt()
        for (i in size downTo 1) {
            if ((newN and (1L shl i)) != 0L) {
                count += dp[i - 1] + (newN - (1L shl i) + 1)
                newN -= (1L shl i)
            }
        }
        return count
    }

    val (n, m) = readLine().split(" ").map { it.toLong() }
    dp[0] = 1
    for (i in 1..54) {
        dp[i] = (dp[i - 1] shl 1) + (1L shl i)
    }
    val result = countOne(m) - countOne(n - 1)

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
