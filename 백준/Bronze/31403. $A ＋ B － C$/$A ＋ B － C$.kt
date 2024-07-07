import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine()
    val b = readLine()
    val c = readLine().toInt()

    bw.write("${a.toInt() + b.toInt() - c}\n")
    bw.write("${(a + b).toInt() - c}")

    bw.flush()
    bw.close()
}