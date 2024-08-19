import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    var result = 0
    val board = Array(101) { IntArray(101) }

    repeat(t) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        for (i in a..<a + 10) {
            for (j in b..<b + 10) {
                board[i][j] = 1
            }
        }
    }

    for (i in 1..100) {
        for (j in 1..100) {
            if (board[i][j] == 1) result++
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
