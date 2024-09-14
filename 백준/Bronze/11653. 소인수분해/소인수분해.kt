import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = readLine().toInt()
    var temp = 2

    while (n > 1) {
        if (n % temp == 0) {
            n /= temp
            bw.write("$temp\n")
            temp = 2
        } else {
            temp++
        }
    }

    bw.flush()
    bw.close()
    close()
}
