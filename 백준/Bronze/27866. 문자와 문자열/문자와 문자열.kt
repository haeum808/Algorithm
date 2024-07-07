import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val s = readLine()
    val i = readLine().toInt()

    bw.write("${s[i - 1]}")
    bw.flush()
    bw.close()
}