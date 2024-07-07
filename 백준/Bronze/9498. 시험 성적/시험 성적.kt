import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    when(readLine().toInt()) {
        in 90..100 -> bw.write("A")
        in 80..<90 -> bw.write("B")
        in 70..<80 -> bw.write("C")
        in 60..<70 -> bw.write("D")
        else -> bw.write("F")
    }

    bw.flush()
    bw.close()
}