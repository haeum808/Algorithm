import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val chess = intArrayOf(1, 1, 2, 2, 2, 8)
    val numbers = readLine().split(" ").map { it.toInt() }

    for (index in numbers.indices) {
        chess[index] -= numbers[index]
    }

    bw.write(chess.joinToString(" "))
    bw.flush()
    bw.close()
    close()
}