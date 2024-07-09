import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val str = readLine()
    var result = 0L

    for (i in str.indices) {
        var pow = 1L

        repeat(i) {
            pow = pow * 31 % 1234567891
        }

        result += (((str[i].code - 96) % 1234567891) * (pow % 1234567891)) % 1234567891
    }

    bw.write("${result % 1234567891}")
    bw.flush()
    bw.close()
}