import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val board = Array(5) { CharArray(15) }

    repeat(5) {
        val input = readLine()

        for (i in input.indices) {
            board[it][i] = input[i]
        }
    }

    for (i in 0..<15) {
        for (j in 0..<5) {
            if (board[j][i].isDigit() || board[j][i].isLetter()) {
                bw.write("${board[j][i]}")
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
