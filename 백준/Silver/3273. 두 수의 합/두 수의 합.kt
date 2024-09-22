import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()
    val x = readLine().toInt()
    var i = 0
    var j = numbers.lastIndex
    var count = 0

    while (i < j) {
        if (numbers[i] + numbers[j] == x) {
            count++
            i++
            j--
        } else if (numbers[i] + numbers[j] < x) {
            i++
        } else {
            j--
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}
