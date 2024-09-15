import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a1, a0) = readLine().split(" ").map { it.toInt() }
    val c = readLine().toInt()
    var n0 = readLine().toInt()

    while (n0 <= 100) {
        if (n0 * a1 + a0 > c * n0) {
            bw.write("0")
            bw.flush()
            bw.close()
            return@with
        }
        n0++
    }

    bw.write("1")
    bw.flush()
    bw.close()
    close()
}
