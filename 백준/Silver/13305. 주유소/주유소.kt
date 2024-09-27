import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val distance = readLine().split(" ").map { it.toInt() }
    val prices = readLine().split(" ").map { it.toInt() }
    var i = 1
    var temp = 1
    var sum = prices[0] * distance[0]

    while (i < n - 1) {
        if (prices[temp] <= prices[i + 1]) {
            sum += prices[temp] * distance[i]
        } else if (i == n - 2) {
            sum += prices[temp] * distance[i]
        } else {
            sum += prices[i] * distance[i]
            temp++
        }
        i++
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
    close()
}