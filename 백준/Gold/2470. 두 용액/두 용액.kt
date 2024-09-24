import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()
    var i = 0
    var j = numbers.lastIndex
    var sum = 2_000_000_001
    var resultA = 0
    var resultB = 0

    while (i < j) {
        if (abs(numbers[i] + numbers[j]) < sum) {
            sum = abs(numbers[i] + numbers[j])
            resultA = numbers[i]
            resultB = numbers[j]
        }

        if (abs(numbers[i]) > abs(numbers[j])) {
            i++
        } else if (abs(numbers[i]) < abs(numbers[j])) {
            j--
        } else {
            break
        }
    }

    bw.write("$resultA $resultB")

    bw.flush()
    bw.close()
    close()
}
