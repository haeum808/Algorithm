import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var x = readLine().toInt()
    var left = 1
    var right = 1

    while (x != 1) {
        if ((left + right) % 2 == 0 && left == 1) {
            right += 1
        } else if ((left + right) % 2 != 0 && right == 1) {
            left += 1
        } else if ((left + right) % 2 == 0) {
            left--
            right++
        } else if ((left + right) % 2 != 0) {
            left++
            right--
        }
        x--
    }

    bw.write("$left/$right")
    bw.flush()
    bw.close()
    close()
}
