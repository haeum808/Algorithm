import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var count = 0
    var current = 666

    while (true) {

        if ("$current".contains("666")) {
            count++
        }
        if (count == n) {
            bw.write("$current")
            break
        }
        current++
    }

    bw.flush()
    bw.close()
}
