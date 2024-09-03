import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()
    val isVisited = BooleanArray(n)

    fun backtracking(depth: Int, result: String) {
        if (depth == m) {
            bw.write("$result\n")
            return
        }

        var before = 0

        for (index in numbers.indices) {
            if (!isVisited[index] && before != numbers[index]) {
                isVisited[index] = true
                before = numbers[index]
                backtracking(depth + 1, "${result}${numbers[index]} ")
                isVisited[index] = false
            }
        }
    }

    backtracking(0, "")

    bw.flush()
    bw.close()
    close()
}
