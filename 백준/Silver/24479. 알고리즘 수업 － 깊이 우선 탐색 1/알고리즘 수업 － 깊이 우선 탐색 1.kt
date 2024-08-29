import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { PriorityQueue<Int>() }
    val result = IntArray(n + 1)
    val visited = BooleanArray(n + 1)
    var count = 1

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    fun dfs(start: Int) {
        result[start] = count++
        visited[start] = true

        while (graph[start].isNotEmpty()) {
            graph[start].poll().let {
                if (!visited[it]) {
                    dfs(it)
                }
            }
        }

        for (neighbor in graph[start]) {
            if (!visited[neighbor]) {
                dfs(neighbor)
            }
        }
    }

    dfs(r)

    for (i in 1..n) {
        bw.write("${result[i]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
