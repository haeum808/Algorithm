import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val n = readLine().toInt()
        var count = 0
        val numbers = readLine().split(" ").map { it.toDouble() }.sorted()

        for (i in 0..<n - 2) {
            for (j in i + 1..<n) {
                if (numbers.binarySearch((numbers[i] + numbers[j]) / 2) >= 0) {
                    count++
                }
            }
        }
        bw.write("$count\n")
    }

    bw.flush()
    bw.close()
    close()
}
