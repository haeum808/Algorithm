import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(n + 1) { -1 }
    val graph = Array(n + 1) { ArrayDeque<Int>() }
    val queue: Queue<Int> = LinkedList()

    numbers[r] = 0
    queue.offer(r)

    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }

        graph[u].add(v)
        graph[v].add(u)
    }

    while (queue.isNotEmpty()) {
        val current = queue.poll()

        while (graph[current].isNotEmpty()) {
            val next = graph[current].removeFirst()

            if (numbers[next] == -1) {
                numbers[next] = numbers[current] + 1
                queue.offer(next)
            }
        }
    }

    for (i in 1..n) {
        bw.write("${numbers[i]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
