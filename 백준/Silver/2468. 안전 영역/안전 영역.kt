import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val heights = Array(n) { IntArray(n) }
    var maxHeight = 0
    var result = 0
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    for (i in 0..<n) {
        val input = readLine().split(" ").map { it.toInt() }
        for (j in 0..<n) {
            heights[i][j] = input[j]
            maxHeight = maxOf(maxHeight, heights[i][j])
        }
    }

    fun bfs(x: Int, y: Int, visited: Array<BooleanArray>, height: Int) {
        visited[x][y] = true
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.offer(x to y)

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (i in 0..<4) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]

                if (nx in 0..<n && ny in 0..<n && visited[nx][ny].not() && heights[nx][ny] > height) {
                    visited[nx][ny] = true
                    queue.offer(nx to ny)
                }
            }
        }
    }

    for (height in 0..maxHeight) {
        val visited = Array(n) { BooleanArray(n) }
        var count = 0

        for (i in 0..<n) {
            for (j in 0..<n) {
                if (visited[i][j].not() && heights[i][j] > height) {
                    count++
                    bfs(i, j, visited, height)
                }
            }
        }

        result = maxOf(result, count)
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
