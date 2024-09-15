import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val (a, b) = readLine().split(" ").map { it.toInt() }
    var (maxX, minX) = a to a
    var (maxY, minY) = b to b

    repeat(n - 1) {
        val (x, y) = readLine().split(" ").map { it.toInt() }

        if (x > maxX) {
            maxX = x
        } else if (x < minX) {
            minX = x
        }

        if (y > maxY) {
            maxY = y
        } else if (y < minY) {
            minY = y
        }
    }

    bw.write("${(maxX - minX) * (maxY - minY)}")
    bw.flush()
    bw.close()
    close()
}
