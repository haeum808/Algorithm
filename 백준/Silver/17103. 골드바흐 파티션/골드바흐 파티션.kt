import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    val primes = BooleanArray(1_000_000 + 1) { true }
    primes[0] = false
    primes[1] = false

    for (i in 2..sqrt(1_000_000.0).toInt()) {
        if (primes[i]) {
            for (j in i * i..1_000_000 step i) {
                primes[j] = false
            }
        }
    }

    repeat(t) {
        val n = readLine().toInt()
        var count = 0

        for (i in 2..n / 2) {
            if (primes[i] && primes[n - i]) {
                count++
            }
        }

        bw.write("$count\n")
    }

    bw.flush()
    bw.close()
    close()
}
