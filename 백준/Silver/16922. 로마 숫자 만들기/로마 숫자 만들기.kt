import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val roma = intArrayOf(1, 5, 10, 50)
    val n = readLine().toInt()
    val answers = hashSetOf<Int>()

    fun backtracking(depth: Int, sum: Int, index: Int) {
        if (depth == n) {
            answers.add(sum)
            return
        }

        for (i in index..<roma.size) {
            backtracking(depth + 1, sum + roma[i], i)
        }
    }

    backtracking(0, 0, 0)

    bw.write("${answers.size}")
    bw.flush()
    bw.close()
    close()
}
