import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().toInt()
    val b = readLine().toInt()

    when {
        a > 0 && b > 0 -> { bw.write("1") }
        a < 0 && b > 0 -> { bw.write("2") }
        a < 0 && b < 0 -> { bw.write("3") }
        a > 0 && b < 0 -> { bw.write("4") }
    }

    bw.flush()
    bw.close()
}