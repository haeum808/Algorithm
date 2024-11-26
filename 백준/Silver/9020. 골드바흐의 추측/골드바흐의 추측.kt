import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val primes = BooleanArray(10001) { true }
    primes[0] = false
    primes[1] = false

    for (i in 2..sqrt(10000.0).toInt()) {
        if (primes[i]) {
            for (j in i * i..10000 step i) {
                primes[j] = false
            }
        }
    }

    val t = readLine().toInt()

    repeat(t) {
        val next = readLine().toInt()
        var left = 0
        var right = 0

        for (i in 2..next / 2) {
            if (primes[i] && primes[next - i]) {
                left = i
                right = next - i
            }
        }

        bw.write("$left $right\n")
    }

    bw.flush()
    bw.close()
    close()
}
