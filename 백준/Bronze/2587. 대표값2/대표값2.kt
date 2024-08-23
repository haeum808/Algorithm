import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val numbers = IntArray(5) { readLine().toInt() }.sorted()

    bw.write("${numbers.average().toInt()}\n")
    bw.write("${numbers[2]}")

    bw.flush()
    bw.close()
    close()
}
