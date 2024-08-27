import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val numbers = ArrayList<Int>(n)
    val visited = BooleanArray(n + 1)

    fun choose(curNum: Int) {
        if (numbers.size >= 2 && numbers[numbers.size - 1] < numbers[numbers.size - 2]) {
            return
        }

        if (curNum == m) {
            bw.write("${numbers.joinToString(" ")}\n")
            return
        }

        for (i in 1..n) {
            if (!visited[i]) {
                visited[i] = true
                numbers.add(i)
                choose(curNum + 1)
                numbers.removeLast()
                visited[i] = false
            }
        }
    }

    choose(0)

    bw.flush()
    bw.close()
    close()
}
