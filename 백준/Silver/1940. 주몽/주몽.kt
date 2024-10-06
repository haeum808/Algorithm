import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val m = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()

    var i = 0
    var j = n - 1
    var count = 0

    while(i < j) {
        if (numbers[i] + numbers[j] == m) {
            i += 1
            j -= 1
            count++
        } else if (numbers[i] + numbers[j] < m) {
            i += 1
        } else {
            j -= 1
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}
