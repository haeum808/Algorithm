import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

data class Examiner(
    val x: Int,
    val y: Int,
    val k: Int,
): Comparable<Examiner> {
    override fun compareTo(other: Examiner): Int = k - other.k
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { readLine().split(" ").map { it.toInt() }.toTypedArray() }
    val (s, x, y) = readLine().split(" ").map { it.toInt() }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    val visited = mutableMapOf<Examiner, Boolean>()

    for (i in 1..s) {
        val priorityQueue: PriorityQueue<Examiner> = PriorityQueue()

        for (i in 0..<n) {
            for (j in 0..<n) {
                if (graph[i][j] in 1..k) {
                    val examiner = Examiner(i, j, graph[i][j])

                    if (visited.containsKey(examiner).not()) {
                        visited[examiner] = true
                        priorityQueue.offer(Examiner(i, j, graph[i][j]))
                    }
                }
            }
        }

        if (priorityQueue.isEmpty()) break

        while (priorityQueue.isNotEmpty()) {
            val examiner = priorityQueue.poll()

            for (v in 0..<4) {
                val nx = examiner.x + dx[v]
                val ny = examiner.y + dy[v]

                if (nx in 0..<n && ny in 0..<n && graph[nx][ny] == 0) {
                    graph[nx][ny] = examiner.k
                }
            }
        }
    }

    bw.write("${graph[x - 1][y - 1]}")
    bw.flush()
    bw.close()
    close()
}
