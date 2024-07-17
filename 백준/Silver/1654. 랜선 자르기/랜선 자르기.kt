import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (k, n) = readLine().split(" ").map { it.toInt() }
    val lines = LongArray(k) { readLine().toLong() }
    var start = 0L
    var end = lines.max() + 1

    while (start + 1 < end) {
        val mid = (start + end) / 2
        val temp = lines.sumOf { it / (mid) }

        if (temp >= n) {
            start = mid
        } else {
            end = mid
        }
    }

    bw.write("$start")
    bw.flush()
    bw.close()
}
