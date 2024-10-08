import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }.toTypedArray()
    var result = numbers[0]

    if (n != 1) {
        for (i in 1..<n) {
            numbers[i] = maxOf(numbers[i], numbers[i] + numbers[i - 1])
            result = maxOf(result, numbers[i])
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
