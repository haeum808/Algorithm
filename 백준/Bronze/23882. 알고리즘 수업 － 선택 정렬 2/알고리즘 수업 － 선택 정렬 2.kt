import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var (n, k) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.toIntArray()

    for (i in numbers.lastIndex downTo 1) {
        var maxIndex = i

        for (j in i - 1 downTo 0) {
            if (numbers[maxIndex] < numbers[j]) {
                maxIndex = j
            }
        }

        if (i != maxIndex) {
            val temp = numbers[maxIndex]
            numbers[maxIndex] = numbers[i]
            numbers[i] = temp
            k--

            if (k == 0) {
                bw.write(numbers.joinToString(" "))
                break
            }
        }
    }

    if (k != 0) bw.write("-1")

    bw.flush()
    bw.close()
    close()
}
