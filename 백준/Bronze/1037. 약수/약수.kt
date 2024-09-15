import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()

    bw.write("${numbers[0] * numbers[numbers.size - 1]}")
    bw.flush()
    bw.close()
    close()
}
