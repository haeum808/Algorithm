import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var (n, b) = readLine().split(" ").map { it.toInt() }
    val intToAlphabet = CharArray(26) { 'A' + it }
    val stringBuilder = StringBuilder()

    while (n >= 1) {
        val temp = n % b
        n /= b

        if (temp in 0..9) {
            stringBuilder.append("$temp")
        } else {
            stringBuilder.append("${intToAlphabet[temp - 10]}")
        }
    }

    bw.write("${stringBuilder.reverse()}")
    bw.flush()
    bw.close()
    close()
}
