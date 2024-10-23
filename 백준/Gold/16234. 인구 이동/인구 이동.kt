import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue
import kotlin.math.abs

data class Point(
    val x: Int,
    val y: Int,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, l, r) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { readLine().split(" ").map { it.toInt() }.toTypedArray() }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    var count = 0
    val visited = mutableMapOf<Point, Boolean>()
    var isChanged = false

    fun bfs(x: Int, y: Int) {
        var sum = graph[x][y]
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val results = mutableListOf<Pair<Int, Int>>()

        queue.offer(x to y)
        visited[Point(x, y)] = true
        results.add(x to y)

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (i in 0..<4) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]

                if (nx in 0..<n && ny in 0..<n && visited[Point(
                        nx,
                        ny
                    )] == null && abs(graph[cx][cy] - graph[nx][ny]) in l..r
                ) {
                    isChanged = true
                    visited[Point(nx, ny)] = true
                    sum += graph[nx][ny]
                    queue.offer(nx to ny)
                    results.add(nx to ny)
                }
            }
        }

        for (result in results) {
            val cx = result.first
            val cy = result.second

            graph[cx][cy] = sum / results.size
        }
    }

    while (true) {
        for (i in 0..<n) {
            for (j in 0..<n) {
                if (visited[Point(i, j)] == null) {
                    bfs(i, j)
                }
            }
        }

        if (!isChanged) {
            break
        } else {
            count++
        }

        isChanged = false
        visited.clear()
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}
