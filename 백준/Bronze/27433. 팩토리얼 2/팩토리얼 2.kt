import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toLong()

    bw.write("${factorial(n)}")
    bw.flush()
    bw.close()
    close()
}

fun factorial(n: Long): Long {
    if (n == 0L) {
        return 1
    }

    return n * factorial(n - 1)
}