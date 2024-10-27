import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

data class Point(
    val z: Int,
    val x: Int,
    val y: Int,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (m, n, h) = readLine().split(" ").map { it.toInt() }
    val graph = Array(h) { Array(n) { IntArray(m) } }
    val queue: Queue<Point> = LinkedList()
    val dx = intArrayOf(1, -1, 0, 0, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1, 0, 0)
    val dz = intArrayOf(0, 0, 0, 0, 1, -1)
    var result = 0

    for (i in 0..<h) {
        for (j in 0..<n) {
            val input = readLine().split(" ").map { it.toInt() }
            for (k in 0..<m) {
                graph[i][j][k] = input[k]
                if (input[k] == 1) queue.offer(Point(i, j, k))
            }
        }
    }

    while (queue.isNotEmpty()) {
        val currentSize = queue.size

        repeat(currentSize) {
            val point = queue.poll()
            for (direction in 0..<6) {
                val nx = point.x + dx[direction]
                val ny = point.y + dy[direction]
                val nz = point.z + dz[direction]

                if (nx in 0..<n && ny in 0..<m && nz in 0..<h && graph[nz][nx][ny] == 0) {
                    graph[nz][nx][ny] = 1
                    queue.offer(Point(nz, nx, ny))
                }
            }
        }

        result++
    }

    for (i in 0..<h) {
        for (j in 0..<n) {
            for (k in 0..<m) {
                if (graph[i][j][k] == 0) {
                    result = -1
                    break
                }
            }
        }
        if (result == -1) break
    }

    if (result != -1) result -= 1

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
