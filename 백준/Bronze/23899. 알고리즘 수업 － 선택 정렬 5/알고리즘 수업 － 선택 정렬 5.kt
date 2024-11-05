import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }.toIntArray()
    val target = readLine().split(" ").map { it.toInt() }.toIntArray()

    for (i in numbers.lastIndex downTo 0) {
        if (numbers.contentEquals(target)) {
            break
        }

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
        }
    }

    if (numbers.contentEquals(target)) bw.write("1") else bw.write("0")

    bw.flush()
    bw.close()
    close()
}
