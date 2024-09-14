import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val m = readLine().toInt()
    val n = readLine().toInt()
    val primes = mutableListOf<Int>()

    (m..n).forEach {
        if (isPrime(it)) primes.add(it)
    }

    if (primes.size == 0) {
        bw.write("-1")
    } else {
        bw.write("${primes.sum()}\n${primes[0]}")
    }

    bw.flush()
    bw.close()
    close()
}

fun isPrime(n: Int): Boolean {
    if (n == 1) return false
    
    for (i in 2..<n) {
        if (n % i == 0) return false
    }

    return true
}
