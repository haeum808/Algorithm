import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.PriorityQueue
import java.util.Queue

data class Point(
    val x: Int,
    val y: Int,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val depth = IntArray(n + 1) { -1 }
    val graph = Array(n + 1) { PriorityQueue<Int>() }
    val queue: Queue<Int> = LinkedList()
    var result = 0L
    var order = 1L
    depth[r] = 0

    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }

        graph[u].offer(v)
        graph[v].offer(u)
    }

    queue.offer(r)

    while (queue.isNotEmpty()) {
        val current = queue.poll()
        result += depth[current] * order++

        while (graph[current].isNotEmpty()) {
            val next = graph[current].poll()

            if (depth[next] == -1) {
                queue.offer(next)
                depth[next] = depth[current] + 1
            }
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
