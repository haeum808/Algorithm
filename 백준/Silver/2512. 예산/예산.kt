import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val prices = readLine().split(" ").map { it.toInt() }.sorted()
    val budget = readLine().toInt()
    var left = 1
    var right = prices[n - 1]

    while (left <= right) {
        val mid = (left + right) / 2
        var tempBudget = budget

        for (price in prices) {
            tempBudget -= if (price > mid) mid else price
        }

        if (tempBudget >= 0) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    bw.write("$right")
    bw.flush()
    bw.close()
    close()
}
