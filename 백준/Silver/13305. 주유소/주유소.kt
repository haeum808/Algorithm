import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val distance = readLine().split(" ").map { it.toInt() }
    val prices = readLine().split(" ").map { it.toInt() }.toTypedArray()
    prices[n - 1] = Int.MAX_VALUE
    var sum = 0
    var temp = 0
    var i = 0

    repeat(n - 1) {
        if (prices[temp] < prices[i + 1]) {
            sum += prices[temp] * distance[i]
        } else {
            sum += prices[temp] * distance[i]
            temp = i + 1
        }

        i++
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
    close()
}