import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = List(n) { readLine().toInt() }.sorted()

    bw.write("${numbers.average().roundToInt()}\n")
    bw.write("${numbers[n / 2]}\n")

    val group = numbers.groupBy { it }
    val max = group.maxOf { it.value.size }

    group.filter { it.value.size == max }.let {
        if (it.size == 1) {
            bw.write("${it.keys.first()}\n")
        } else {
            bw.write("${it.keys.sorted()[1]}\n")
        }
    }

    bw.write("${numbers[n - 1] - numbers[0]}")
    bw.flush()
    bw.close()
}
