import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val houses = readLine().split(" ").map { it.toInt() }.sorted()

    bw.write("${houses[(n - 1) / 2]}")
    bw.flush()
    bw.close()
    close()
}
