import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.TreeSet

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = readLine().split(" ").map { it.toInt() }.sorted()
    val isVisited = BooleanArray(n)
    val results = mutableSetOf<String>()

    fun backtracking(depth: Int, result: String) {
        if (depth == m) {
            results.add(result)
            return
        }

        for (index in numbers.indices) {
            if (!isVisited[index]) {
                isVisited[index] = true
                backtracking(depth + 1, "${result}${numbers[index]} ")
                isVisited[index] = false
            }
        }
    }

    backtracking(0, "")

    results.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    close()
}
