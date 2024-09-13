import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt() }

    var count = 1
    for (i in 1..n) {
        if (n % i == 0) {
            if (count == k) {
                bw.write("$i")
                bw.flush()
                bw.close()
                return@with
            }
            count++
        }
    }

    bw.write("0")

    bw.flush()
    bw.close()
    close()
}
