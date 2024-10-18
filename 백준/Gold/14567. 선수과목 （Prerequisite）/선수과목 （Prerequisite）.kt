import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.ArrayList
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }
    val degrees = IntArray(n + 1)
    val queue: Queue<Int> = LinkedList()
    val result = IntArray(n + 1) { 1 }

    repeat(m) {
        val (x, y) = readLine().split(" ").map { it.toInt() }

        graph[x].add(y)
        degrees[y]++
    }

    for (i in 1..n) {
        if (degrees[i] == 0) queue.offer(i)
    }

    while (queue.isNotEmpty()) {
        val next = queue.poll()

        for (i in 0..<graph[next].size) {
            val degree = graph[next][i]

            degrees[degree]--

            if (degrees[degree] == 0) {
                result[degree] = maxOf(result[degree], result[next] + 1)

                queue.offer(degree)
            }
        }
    }

    for (i in 1..n) {
        bw.write("${result[i]} ")
    }

    bw.flush()
    bw.close()
    close()
}