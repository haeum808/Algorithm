import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }

    fun backtracking(depth: Int,answer: String) {
        if (depth == m) {
            bw.write("$answer\n")
            return
        }

        for (number in 1..n) {
            backtracking(depth + 1, "$answer$number ")
        }
    }

    backtracking(0, "")

    bw.flush()
    bw.close()
    close()
}
