import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()
    when (n) {
        "1" -> {
            bw.write("2")
        }

        "2" -> {
            bw.write("4")
        }

        "3" -> {
            bw.write("8")
        }

        "4" -> {
            bw.write("16")
        }

        "5" -> {
            bw.write("32")
        }
    }

    bw.flush()
    bw.close()
    close()
}
