import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val numbers = IntArray(n)
    var result = 0
    var index = 0

    while (st.hasMoreTokens()) {
        numbers[index] = st.nextToken().toInt()
        result = maxOf(result, numbers[index])
        index++
    }

    val dp = IntArray(n) { numbers[it] }

    for (i in 1..<n) {
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
