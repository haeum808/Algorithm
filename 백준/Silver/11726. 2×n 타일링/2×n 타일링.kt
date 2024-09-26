import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = IntArray(1001)
    numbers[1] = 1
    numbers[2] = 2

    for (i in 3..n) {
        numbers[i] = (numbers[i - 1] + numbers[i - 2]) % 10_007
    }

    bw.write("${numbers[n]}")
    bw.flush()
    bw.close()
    close()
}