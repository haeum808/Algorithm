import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()

    when (numbers.toSet().size) {
        1 -> bw.write("${10000 + numbers[0] * 1000}")
        3 -> bw.write("${numbers[2] * 100}")
        else -> bw.write("${numbers[1] * 100 + 1000}")
    }

    bw.flush()
    bw.close()
}
