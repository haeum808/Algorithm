import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = readLine().split(" ")

    bw.write(maxOf(a.reversed(), b.reversed()))
    bw.flush()
    bw.close()
    close()
}
