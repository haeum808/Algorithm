import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { readLine().split(" ").map { it.toInt() }.toTypedArray() }
    var maxSafeArea = 0
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    fun spreadVirus(): Int {
        val tempGraph = graph.map { it.copyOf() }.toTypedArray()
        val queue: Queue<Pair<Int, Int>> = LinkedList()

        for (i in 0..<n) {
            for (j in 0..<m) {
                if (tempGraph[i][j] == 2) {
                    queue.offer(i to j)
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()

            for (k in 0..<4) {
                val nx = x + dx[k]
                val ny = y + dy[k]

                if (nx in 0..<n && ny in 0..<m && tempGraph[nx][ny] == 0) {
                    tempGraph[nx][ny] = 2
                    queue.offer(nx to ny)
                }
            }
        }

        return tempGraph.sumOf { row -> row.count { it == 0 } }
    }

    fun placeWalls(depth: Int) {
        if (depth == 3) {
            maxSafeArea = maxOf(maxSafeArea, spreadVirus())
            return
        }

        for (i in 0..<n) {
            for (j in 0..<m) {
                if (graph[i][j] == 0) {
                    graph[i][j] = 1
                    placeWalls(depth + 1)
                    graph[i][j] = 0
                }
            }
        }
    }

    placeWalls(0)
    bw.write("$maxSafeArea")
    bw.flush()
    bw.close()
    close()
}
