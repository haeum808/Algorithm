import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { IntArray(m) }
    val isVisited = Array(n) { BooleanArray(m) }
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    for (i in 0..<n) {
        val input = readLine()

        for (j in 0..<m) {
            graph[i][j] = input[j].digitToInt()
        }
    }

    fun bfs() {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.offer(0 to 0)
        isVisited[0][0] = true

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()

            for (i in 0..<4) {
                val nx = x + dx[i]
                val ny = y + dy[i]

                if (nx in 0..<n && ny in 0..<m && graph[nx][ny] == 1 && !isVisited[nx][ny]) {
                    isVisited[nx][ny] = true
                    graph[nx][ny] = graph[x][y] + 1
                    queue.offer(nx to ny)
                }
            }
        }
    }

    bfs()

    bw.write("${graph[n - 1][m - 1]}")
    bw.flush()
    bw.close()
    close()
}
