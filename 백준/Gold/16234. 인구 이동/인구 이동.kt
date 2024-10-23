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

    fun bfs(start: Point) {
        var sum = graph[start.x][start.y]
        val queue: Queue<Point> = LinkedList()
        val points = mutableListOf<Point>()

        queue.offer(start)
        visited[start] = true
        points.add(start)

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (i in 0..<4) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]

                if (nx in 0..<n &&
                    ny in 0..<n &&
                    visited[Point(nx, ny)] == null &&
                    abs(graph[cx][cy] - graph[nx][ny]) in l..r
                ) {
                    val point = Point(nx, ny)
                    isChanged = true
                    visited[point] = true
                    sum += graph[nx][ny]
                    queue.offer(point)
                    points.add(point)
                }
            }
        }

        for (point in points) {
            val cx = point.x
            val cy = point.y

            graph[cx][cy] = sum / points.size
        }
    }

    while (true) {
        for (i in 0..<n) {
            for (j in 0..<n) {
                if (visited[Point(i, j)] == null) {
                    bfs(Point(i, j))
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
