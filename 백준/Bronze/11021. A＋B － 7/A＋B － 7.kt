import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    repeat(n) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        bw.write("Case #${it + 1}: ${a + b}\n")
    }

    bw.flush()
    bw.close()
}
