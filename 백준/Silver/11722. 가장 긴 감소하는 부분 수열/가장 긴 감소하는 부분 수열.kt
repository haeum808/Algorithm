import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    val dp = IntArray(n) { 1 }
    var result = 0

    for (i in 0..<n) {
        for (j in 0..<i) {
            if (arr[i] < arr[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
        result = maxOf(result, dp[i])
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
