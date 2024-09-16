import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val chess = Array(n) { CharArray(m) }
    var result = Int.MAX_VALUE

    for (i in 0 until n) {
        val input = readLine()
        for (j in 0 until m) {
            chess[i][j] = input[j]
        }
    }

    fun check(x: Int, y: Int, firstColor: Char): Int {
        var count = 0
        val secondColor = if (firstColor == 'W') 'B' else 'W'

        for (i in 0 until 8) {
            for (j in 0 until 8) {
                val expectedColor = if ((i + j) % 2 == 0) firstColor else secondColor
                if (chess[x + i][y + j] != expectedColor) count++
            }
        }
        return count
    }

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            val countW = check(i, j, 'W')
            val countB = check(i, j, 'B')
            result = minOf(result, countW, countB)
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
