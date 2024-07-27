import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().toInt()
    val b = readLine()

    bw.write("${a * b[2].digitToInt()}\n")
    bw.write("${a * b[1].digitToInt()}\n")
    bw.write("${a * b[0].digitToInt()}\n")
    bw.write("${a * b.toInt()}")
    bw.flush()
    bw.close()
}