import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { PriorityQueue<Int>() }
    val isVisited = BooleanArray(n + 1)
    val result = IntArray(n + 1)
    var count = 1

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
        graph[b].add(a)
    }

    fun bfs(start: Int) {
        val queue: Queue<Int> = LinkedList()
        queue.add(start)
        result[start] = count++
        isVisited[start] = true

        while (queue.isNotEmpty()) {
            val next = queue.poll()

            while (graph[next].isNotEmpty()) {
                val children = graph[next].poll()

                if (!isVisited[children]) {
                    result[children] = count++
                    isVisited[children] = true
                    queue.add(children)
                }
            }
        }
    }

    bfs(r)

    for (i in 1..n) {
        bw.write("${result[i]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
