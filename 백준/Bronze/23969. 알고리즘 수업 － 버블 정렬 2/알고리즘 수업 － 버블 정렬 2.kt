import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var (n, k) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.toIntArray()

    for (last in n - 1 downTo 1) {
        for (i in 0..<last) {
            if (numbers[i] > numbers[i + 1]) {
                val temp = numbers[i + 1]
                numbers[i + 1] = numbers[i]
                numbers[i] = temp
                k--
            }

            if (k == 0) {
                bw.write(numbers.joinToString(" "))
                break
            }
        }

        if (k == 0) break
    }

    if (k != 0) {
        bw.write("-1")
    }

    bw.flush()
    bw.close()
    close()
}
