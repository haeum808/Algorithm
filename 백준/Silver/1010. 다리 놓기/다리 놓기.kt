import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val (n, m) = readLine().split(" ").map { it.toLong() }
        var a = BigInteger.ONE
        var b = BigInteger.ONE

        (n downTo 2).forEach {
            a *= BigInteger.valueOf(it)
        }

        (m downTo m - n + 1).forEach {
            b *= BigInteger.valueOf(it)
        }

        bw.write("${b / a}\n")
    }

    bw.flush()
    bw.close()
    close()
}
