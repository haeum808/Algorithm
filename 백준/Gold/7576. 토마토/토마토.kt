import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

data class Point(
    val x: Int,
    val y: Int,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (m, n) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { IntArray(m) }
    val queue: Queue<Point> = LinkedList()
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    var current = queue.size
    var result = 0

    for (i in 0..<n) {
        val input = readLine().split(" ").map { it.toInt() }

        for (j in 0..<m) {
            graph[i][j] = input[j]

            if (input[j] == 1) queue.offer(Point(i, j))
        }
    }

    while (true) {
        repeat(current) {
            val next = queue.poll()

            for(i in 0..<4) {
                val nx = next.x + dx[i]
                val ny = next.y + dy[i]

                if (nx in 0..<n && ny in 0..<m && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1
                    queue.offer(Point(nx, ny))
                }
            }
        }

        if (queue.isEmpty()) break

        current = queue.size
        result++
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (graph[i][j] == 0) result = -1
        }
    }

    if (result != -1) result -=1

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
