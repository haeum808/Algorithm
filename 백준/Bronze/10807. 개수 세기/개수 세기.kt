import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val v = readLine().toInt()

    bw.write("${numbers.count { it == v }}")

    bw.flush()
    bw.close()
    close()
}
