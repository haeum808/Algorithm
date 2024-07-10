import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b, v) = readLine().split(" ").map { it.toInt()}
    var result = (v - b) / (a - b)

    if ((v - b) % (a - b) > 0) {
        result += 1
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}
