import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.PriorityQueue

data class Node(
    val index: Int,
    val distance: Int,
) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return distance - other.distance
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (V, E) = readLine().split(" ").map { it.toInt() }
    val k = readLine().toInt()
    val graph = Array(V + 1) { LinkedList<Node>() }
    val distance = IntArray(V + 1) { Int.MAX_VALUE }

    fun dijkstra(start: Int) {
        val pq = PriorityQueue<Node>()
        pq.offer(Node(start, 0))
        distance[start] = 0

        while (pq.isNotEmpty()) {
            val (curIndex, curDistance) = pq.poll()

            if (distance[curIndex] < curDistance) continue

            for (node in graph[curIndex]) {
                val cost = curDistance + node.distance

                if (cost < distance[node.index]) {
                    distance[node.index] = cost
                    pq.offer(Node(node.index, distance[node.index]))
                }
            }
        }
    }

    repeat(E) {
        val (u, v, w) = readLine().split(" ").map { it.toInt() }

        graph[u].add(Node(v, w))
    }

    dijkstra(k)

    for (i in 1..V) {
        if (distance[i] == Int.MAX_VALUE) bw.write("INF\n")
        else bw.write("${distance[i]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
