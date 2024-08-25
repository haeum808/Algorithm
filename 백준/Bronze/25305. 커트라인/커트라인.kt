import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val scores = readLine().split(" ").map { it.toInt() }.sortedDescending()

    bw.write("${scores[k - 1]}")

    bw.flush()
    bw.close()
    close()
}
