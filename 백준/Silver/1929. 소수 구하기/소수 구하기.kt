import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (m, n) = readLine().split(" ").map { it.toInt() }
    val isPrime = BooleanArray(1_000_001) { true }
    isPrime[1] = false

    for (i in 2 .. sqrt(1_000_000.0).toInt()) {

        for (j in i * 2 .. 1_000_000 step i) {
            isPrime[j] = false
        }
    }

    (m..n).forEach {
        if (isPrime[it]) {
            bw.write("${it}\n")
        }
    }

    bw.flush()
    bw.close()
}
