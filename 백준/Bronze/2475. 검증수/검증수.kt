import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sum = readLine().split(" ").sumOf { it.toInt() * it.toInt() }

    bw.write("${sum % 10}")
    bw.flush()
    bw.close()
}