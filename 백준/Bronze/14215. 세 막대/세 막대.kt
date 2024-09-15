import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var (a, b, c) = readLine().split(" ").map { it.toInt() }.sorted()

    while (a + b <= c) {
        c--
    }

    bw.write("${a + b + c}")
    bw.flush()
    bw.close()
    close()
}
