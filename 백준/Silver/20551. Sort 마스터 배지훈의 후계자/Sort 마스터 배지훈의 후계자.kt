import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(n) { readLine().toInt() }.sorted()

    repeat(m) {
        val input = readLine().toInt()
        var low = 0
        var high = n - 1
        var result = -1

        while (low <= high) {
            val mid = (low + high) / 2

            if (numbers[mid] == input) {
                result = mid
                high = mid - 1
            } else if (numbers[mid] > input) {
                high = mid - 1
            } else if (numbers[mid] < input) {
                low = mid + 1
            }
        }

        bw.write("$result\n")
    }

    bw.flush()
    bw.close()
    close()
}
