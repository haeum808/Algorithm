import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val temperatures = IntArray(n + 1)
    val input = readLine().split(" ").map { it.toInt() }

    var result = Int.MIN_VALUE
    var sum = 0
    for (i in input.indices) {
        sum += input[i]
        temperatures[i + 1] = sum
    }

    for (i in n downTo k) {
        result = max(result, temperatures[i] - temperatures[i - k])
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
