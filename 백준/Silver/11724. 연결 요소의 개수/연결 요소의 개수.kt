import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayDeque<Int>() }
    val visited = BooleanArray(n + 1)
    var count = 0

    fun dfs(x: Int) {
        visited[x] = true

        for (i in graph[x].indices) {
            val next = graph[x][i]

            if (visited[next].not()) {
                dfs(next)
            }
        }
    }

    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }

    for (i in 1..n) {
        if (visited[i].not()) {
            count++
            dfs(i)
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}
