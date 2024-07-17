import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (k, n) = readLine().split(" ").map { it.toInt() }
    val lines = LongArray(k) { readLine().toLong() }
    var start = 1L
    var end = lines[0] + 1

    while (start < end) {
        val mid = (start + end) / 2
        val temp = lines.sumOf { it / (mid) }

        if (temp < n) {
            end = mid
        } else {
            start = mid + 1
        }
    }

    bw.write("${start - 1}")
    bw.flush()
    bw.close()
}
