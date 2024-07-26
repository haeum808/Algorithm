import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b, c) = readLine().split(" ").map { BigInteger(it) }

    val result = (a + b + c)

    bw.write("$result")
    bw.flush()
    bw.close()
}