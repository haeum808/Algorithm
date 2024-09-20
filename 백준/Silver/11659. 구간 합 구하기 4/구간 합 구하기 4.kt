import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(n + 1)
    val input = readLine().split(" ").map { it.toInt() }

    var sum = 0
    for (i in input.indices) {
        sum += input[i]
        numbers[i + 1] = sum
    }

    repeat(m) {
        val (i, j) = readLine().split(" ").map { it.toInt() }
        bw.write("${numbers[j] - numbers[i - 1]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
