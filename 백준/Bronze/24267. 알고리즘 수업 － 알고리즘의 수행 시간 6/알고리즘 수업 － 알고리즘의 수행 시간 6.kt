import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toLong()

    bw.write("${n * (n - 1) * (n - 2) / 2 / 3}\n3")
    bw.flush()
    bw.close()
    close()
}
