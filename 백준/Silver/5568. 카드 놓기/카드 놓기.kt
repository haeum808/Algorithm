import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val k = readLine().toInt()
    val numbers = IntArray(n) { readLine().toInt() }
    val isVisited = BooleanArray(n)
    val results = HashSet<String>()

    fun backtracking(depth: Int, result: String) {
        if (depth == k) {
            results.add(result)
            return
        }

        for (index in numbers.indices) {
            if (!isVisited[index]) {
                isVisited[index] = true
                backtracking(depth + 1, "$result${numbers[index]}")
                isVisited[index] = false
            }
        }
    }

    backtracking(0, "")

    bw.write("${results.size}")
    bw.flush()
    bw.close()
    close()
}
