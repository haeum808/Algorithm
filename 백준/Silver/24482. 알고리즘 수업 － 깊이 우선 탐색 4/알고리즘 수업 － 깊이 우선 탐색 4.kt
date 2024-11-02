import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(n + 1) { -1 }
    val graph = Array(n + 1) { PriorityQueue<Int>(reverseOrder()) }

    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }

        graph[u].add(v)
        graph[v].add(u)
    }

    fun dfs(x: Int, depth: Int) {
        numbers[x] = depth

        while (graph[x].isNotEmpty()) {
            val next = graph[x].poll()

            if (numbers[next] == -1) {
                dfs(next, depth + 1)
            }
        }
    }

    dfs(r, 0)

    for (i in 1..n) {
        bw.write("${numbers[i]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
