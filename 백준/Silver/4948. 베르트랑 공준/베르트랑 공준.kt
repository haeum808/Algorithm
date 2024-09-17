import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val primes = BooleanArray(246912 + 1) { true }
    primes[0] = false
    primes[1] = false

    for (i in 2..sqrt(246912.0).toInt()) {
        if (primes[i]) {
            for (j in i * i..246912 step i) {
                primes[j] = false
            }
        }
    }

    while (true) {
        val n = readLine().toInt()

        if (n == 0) break

        bw.write("${(n + 1..2 * n).count { primes[it] }}\n")
    }

    bw.flush()
    bw.close()
    close()
}
