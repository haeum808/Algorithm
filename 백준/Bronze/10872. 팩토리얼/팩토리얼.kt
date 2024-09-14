import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = readLine().toInt()
    var result = 1

    if (n == 0) {
        bw.write("1")
    } else {
       while (n >= 2) {
           result *= n--
       }

        bw.write("$result")
    }

    bw.flush()
    bw.close()
    close()
}
