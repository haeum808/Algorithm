import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = mutableListOf<Int>()
    val fq = IntArray(8001)

    repeat(n) {
        val input = readLine().toInt()

        numbers.add(input)
        fq[input + 4000] += 1
    }

    numbers.sort()

    bw.write("${numbers.average().roundToInt()}\n")
    bw.write("${numbers[n / 2]}\n")

    val max = fq.max()
    var value = Int.MIN_VALUE

    for (i in fq.indices) {

        if (fq[i] == max && value == Int.MIN_VALUE) {
            value = i - 4000
        } else if (fq[i] == max) {
            value = i - 4000
            break
        }
    }

    bw.write("$value\n")
    bw.write("${numbers[n - 1] - numbers[0]}")
    bw.flush()
    bw.close()
}
