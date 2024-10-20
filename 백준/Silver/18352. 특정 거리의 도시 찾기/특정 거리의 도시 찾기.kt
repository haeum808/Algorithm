import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, k, x) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }
    val distance = IntArray(n + 1) { -1 }
    distance[x] = 0

    fun bfs(start: Int) {
        val queue: Queue<Int> = LinkedList()
        queue.offer(start)

        while (queue.isNotEmpty()) {
            val t = queue.poll()

            for (i in 0..<graph[t].size) {
                val v = graph[t][i]

                if (distance[v] == -1) {
                    distance[v] = distance[t] + 1
                    queue.offer(v)
                }
            }
        }
    }

    repeat(m) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        graph[a].add(b)
    }

    bfs(x)

    var check = false

    for(i in 1..n) {
       if(distance[i] == k) {
           bw.write("$i\n")
           check = true
       }
    }

    if (!check) bw.write("-1")

    bw.flush()
    bw.close()
    close()
}
