import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toLong() }
    val heights = readLine().split(" ").map { it.toLong() }

    var left = -1L
    var right = 2_000_000_001L
    var max = 0L

    while (left <= right) {
        val mid = (left + right) / 2

        if (heights.sumOf { if (it - mid >= 0) it - mid else 0 } >= m) {
            left = mid + 1
            max = maxOf(max, mid)
        } else {
            right = mid - 1
        }
    }

    bw.write("$max")
    bw.flush()
    bw.close()
    close()
}
