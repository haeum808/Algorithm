import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, v) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { LinkedList<Int>() }
    val dfsVisited = BooleanArray(n + 1)
    val bfsVisited = BooleanArray(n + 1)

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    repeat(n + 1) {
        graph[it].sort()
    }

    fun dfs(r: Int) {
        dfsVisited[r] = true
        bw.write("$r ")

        for (next in graph[r]) {
            if (!dfsVisited[next]) {
                dfs(next)
            }
        }
    }

    fun bfs(r: Int) {
        val queue: Queue<Int> = LinkedList()
        queue.offer(r)
        bfsVisited[r] = true
        bw.write("$r ")

        while (queue.isNotEmpty()) {
            val next = queue.poll()

            for (children in graph[next]) {
                if (!bfsVisited[children]) {
                    bfsVisited[children] = true
                    queue.offer(children)
                    bw.write("$children ")
                }
            }
        }
    }

    dfs(v)
    bw.write("\n")
    bfs(v)

    bw.flush()
    bw.close()
    close()
}
