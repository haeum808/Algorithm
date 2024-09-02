import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    repeat(t) {
        var count = 0
        val (m, n, k) = readLine().split(" ").map { it.toInt() }

        val graph = Array(m) { IntArray(n) }
        val visited = Array(m) { BooleanArray(n) }

        repeat(k) {
            val (a, b) = readLine().split(" ").map { it.toInt() }

            graph[a][b] = 1
        }

        fun bfs(i: Int, j: Int) {
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.offer(i to j)
            visited[i][j] = true

            while (queue.isNotEmpty()) {
                val (x, y) = queue.poll()
                graph[x][y] = 0

                for (direction in 0..<4) {
                    val nx = x + dx[direction]
                    val ny = y + dy[direction]

                    if (nx in 0..<m && ny in 0..<n && graph[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true
                        queue.offer(nx to ny)
                    }
                }
            }
        }

        for (i in 0..<m) {
            for (j in 0..<n) {
                if (graph[i][j] == 1) {
                    bfs(i, j)
                    count++
                }
            }
        }

        bw.write("$count\n")
    }

    bw.flush()
    bw.close()
    close()
}
