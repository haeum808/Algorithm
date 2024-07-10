import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    val numbers = IntArray(10001)

    repeat(n) {
        numbers[readLine().toInt()]++
    }

    numbers.forEachIndexed { index, i ->
        if (i > 0) {
            repeat(i) {
                bw.write("$index\n")
            }
        }
    }

    bw.flush()
    bw.close()
}
