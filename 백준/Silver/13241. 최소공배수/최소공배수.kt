import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = readLine().split(" ").map { it.toLong() }

    bw.write("${lca(a, b, gcd(a, b))}")
    bw.flush()
    bw.close()
    close()
}

fun gcd(a: Long, b: Long): Long {
    if (a % b == 0L) {
        return b
    }
    return gcd(b, a % b)
}

fun lca(a: Long, b: Long, gca: Long): Long {
    return a * b / gca
}