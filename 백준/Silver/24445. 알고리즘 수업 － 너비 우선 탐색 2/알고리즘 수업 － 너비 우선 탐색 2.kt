import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { PriorityQueue<Int>(reverseOrder()) }
    val visited = IntArray(n + 1)
    var count = 1

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    fun bfs(r: Int) {
        val queue: Queue<Int> = LinkedList()
        queue.offer(r)
        visited[r] = count++

        while (queue.isNotEmpty()) {
            val nextQ = queue.poll()

            while (graph[nextQ].isNotEmpty()) {
                val next = graph[nextQ].poll()

                if (visited[next] == 0) {
                    queue.offer(next)
                    visited[next] = count++
                }
            }
        }
    }

    bfs(r)

    for (i in 1..n) {
        bw.write("${visited[i]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
