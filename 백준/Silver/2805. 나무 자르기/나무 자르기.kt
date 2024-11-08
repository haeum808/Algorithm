import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val heights = readLine().split(" ").map { it.toInt() }

    var start = 0L
    var end = heights.max().toLong()
    var result = 0L

    while (start <= end) {
        val mid = (start + end) / 2

        val sum = heights.sumOf { if(it - mid <= 0) 0 else it - mid }

        if (sum >= m) {
            result = mid
            start = mid + 1
        } else {
            end = mid - 1
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
