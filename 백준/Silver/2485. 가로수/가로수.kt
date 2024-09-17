import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun gca(a: Int, b: Int): Int {
        if (a % b == 0) {
            return b
        }

        return gca(b, a % b)
    }

    val n = readLine().toInt()
    val heights = List(n) { readLine().toInt() }
    var interval = gca(heights[1] - heights[0], heights[2] - heights[1])
    var result = 0

    for (i in 1..<heights.size - 1) {
        interval = gca(heights[i + 1] - heights[i], interval)
    }

    for (i in 0..<heights.size - 1) {
        result += (heights[i + 1] - heights[i]) / interval - 1
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
