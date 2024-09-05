import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()

    fun backtracking(depth: Int, answer: String) {
        if (depth == m) {
            bw.write("$answer\n")
            return
        }

        for (i in numbers.indices) {
            backtracking(depth + 1, "$answer${numbers[i]} ")
        }
    }

    backtracking(0, "")

    bw.flush()
    bw.close()
    close()
}
