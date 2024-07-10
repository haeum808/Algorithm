import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = IntArray(n) { readLine().toInt() }.sorted()

    numbers.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
}
