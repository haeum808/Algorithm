import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var count1 = 0
    var count2 = 0

    fun fiboRecursive(n: Int): Int {
        if (n == 1 || n == 2) {
            count1++
            return 1
        }

        return fiboRecursive(n - 1) + fiboRecursive(n - 2)
    }

    fun fiboDynamic(n: Int) {
        val dp = IntArray(41)
        dp[1] = 1
        dp[2] = 1

        for (i in 3..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
            count2++
        }
    }

    fiboRecursive(n)
    fiboDynamic(n)

    bw.write("$count1 $count2")
    bw.flush()
    bw.close()
    close()
}
