import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList

data class Point(
    val x: Int,
    val y: Int,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) { readLine().split(" ").map { it.toInt() }.toIntArray() }
    val queue = LinkedList<Point>()
    val dx = intArrayOf(1, -1, 0, 0, -1, 1, 1, -1)
    val dy = intArrayOf(0, 0, 1, -1, -1, 1, -1, 1)
    var max = 0
    var count = 1

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (map[i][j] == 1) queue.offer(Point(i, j))
        }
    }

    while (true) {
        if (queue.isEmpty()) break

        repeat(queue.size) {
            val (cx,cy) = queue.poll()

            for (i in 0..<8) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]

                if (nx in 0..<n && ny in 0..<m && map[nx][ny] == 0) {
                    map[nx][ny] = count
                    max = maxOf(map[nx][ny], max)
                    queue.offer(Point(nx, ny))
                }
            }
        }

        count++
    }

    bw.write("$max")
    bw.flush()
    bw.close()
    close()
}
