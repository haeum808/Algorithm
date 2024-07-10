import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toLong()
    var factorial = BigInteger.valueOf(n)
    var result = 0

    if (factorial == BigInteger.ZERO || factorial == BigInteger.ONE) bw.write("0")
    else {
        for (i in 2..< n) {
            factorial *= BigInteger.valueOf(i)
        }

        val str = factorial.toString().reversed()

        for (i in str.indices) {
            if (str[i] == '0') {
                result++
            } else {
                bw.write("$result")
                break
            }
        }
    }

    bw.flush()
    bw.close()
}
