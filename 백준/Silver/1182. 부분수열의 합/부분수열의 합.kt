import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, s) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }
    var result = 0

    if (s == 0) result--

    fun backtracking(index: Int, total: Int) {
        if (index == n) {
            if (total == s) {
                result++
            }
            return
        }

        backtracking(index + 1, total)
        backtracking(index + 1, total + numbers[index])
    }

    backtracking(0, 0)
    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
