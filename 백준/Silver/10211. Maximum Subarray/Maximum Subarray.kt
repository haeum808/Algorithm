import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val n = readLine().toInt()
        val numbers = readLine().split(" ").map { it.toInt() }.toTypedArray()

        var result = Int.MIN_VALUE
        var sum = 0

        for (i in numbers.indices) {
            sum += numbers[i]

            if (result < sum) {
                result = sum
            }
            if (sum < 0) {
                sum = 0
            }
        }

        bw.write("$result\n")
    }

    bw.flush()
    bw.close()
    close()
}