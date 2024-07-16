import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    val kgs = IntArray(5001) { -1 }
    kgs[3] = 1
    kgs[5] = 1

    for (i in 6..n) {
        kgs[i] = when {
            kgs[i - 3] != -1 && kgs[i - 5] == -1 -> kgs[i - 3] + 1
            kgs[i - 3] == -1 && kgs[i - 5] != -1 -> kgs[i - 5] + 1
            kgs[i - 3] == -1 && kgs[i - 5] == -1 -> -1
            else -> min(kgs[i - 3], kgs[i - 5]) + 1
        }
    }

    bw.write("${kgs[n]}")
    bw.flush()
    bw.close()
}
