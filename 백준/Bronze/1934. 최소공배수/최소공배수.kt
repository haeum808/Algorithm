import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    fun gcd(a: Int, b: Int): Int = if (a % b == 0) {
        b
    } else {
        gcd(b, a % b)
    }

    fun lca(a: Int, b: Int, gcd: Int): Int = (a * b) / gcd

    repeat(t) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        bw.write("${lca(a, b, gcd(a,b))}\n")
    }

    bw.flush()
    bw.close()
}
