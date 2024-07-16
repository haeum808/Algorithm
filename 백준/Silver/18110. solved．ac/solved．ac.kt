import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    if (n == 0) {
        bw.write("0")
        bw.flush()
        bw.close()
        return
    }

    val scores = List(n) { readLine().toDouble() }.sorted()
    val pivot = (n * 0.15).roundToInt()

    bw.write("${scores.subList(pivot, n - pivot).average().roundToInt()}")
    bw.flush()
    bw.close()
}
