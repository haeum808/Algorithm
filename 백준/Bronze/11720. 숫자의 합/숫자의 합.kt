import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val b = readLine()
    val numbers = readLine()

    bw.write("${numbers.sumOf { it.digitToInt() }}")
    bw.flush()
    bw.close()
}