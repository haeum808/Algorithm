import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, c) = readLine().split(" ").map { it.toInt() }
    val houses = List(n) { readLine().toInt() }.sorted()
    var start = 1
    var end = houses[houses.lastIndex] - houses[0]
    var result = 0

    while (start <= end) {
        val mid = (start + end) / 2
        var value = houses[0]
        var count = 1

        for (index in 1..<n) {
            if (houses[index] >= value + mid) {
                value = houses[index]
                count++
            }
        }

        if (count >= c) {
            start = mid + 1
            result = mid
        } else {
            end = mid - 1
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
