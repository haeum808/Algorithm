import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toLong()

    for (i in 1..t) {
        var n = readLine().toLong()

        while (true) {
            if (isPrime(n)) {
                bw.write("$n\n")
                break
            }
            n++
        }
    }

    bw.flush()
    bw.close()
    close()
}

fun isPrime(n: Long): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0L) return false
    }
    return true
}