import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val str = readLine()
    var result = 0

    for (i in str.indices) {
        result += (str[i].code - 96) * 31.0.pow(i).toInt()
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}