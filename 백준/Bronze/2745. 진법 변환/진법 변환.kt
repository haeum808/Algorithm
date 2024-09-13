import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.pow
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, b) = readLine().split(" ")
    val alphabetToInt = IntArray(26) { it + 10 }
    var count = n.length - 1
    var result = 0

    for (char in n) {
        result += if (char.isDigit()) {
            char.digitToInt() * b.toDouble().pow(count).toInt()
        } else {
            alphabetToInt[char - 'A'] * b.toDouble().pow(count).toInt()
        }
        count--
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
