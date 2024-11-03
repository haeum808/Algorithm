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
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    val n = readLine().toInt()
    val graph = Array(n) { readLine().map { it }.toTypedArray() }
    val graph1 = graph.clone()
    val graph2 = graph.clone()
    val visited1 = Array(n) { BooleanArray(n) }
    val visited2 = Array(n) { BooleanArray(n) }
    var count1 = 0
    var count2 = 0

    fun bfs(x: Int, y: Int, visited: Array<BooleanArray>, graph: Array<Array<Char>>, vararg condition: Char) {
        val queue: Queue<Point> = LinkedList()
        queue.offer(Point(x, y))
        visited[x][y] = true

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (i in 0..<4) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]

                if (nx in 0..<n && ny in 0..<n && visited[nx][ny].not() && condition.contains(graph[nx][ny])) {
                    visited[nx][ny] = true
                    queue.offer(Point(nx, ny))
                }
            }
        }
    }

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (visited1[i][j].not()) {
                count1++
                when (graph1[i][j]) {
                    'R' -> bfs(i, j, visited1, graph1, 'R')
                    'G' -> bfs(i, j, visited1, graph1, 'G')
                    'B' -> bfs(i, j, visited1, graph1, 'B')
                    else -> throw IllegalArgumentException()
                }
            }
        }
    }

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (visited2[i][j].not()) {
                count2++
                when (graph2[i][j]) {
                    'R', 'G' -> bfs(i, j, visited2, graph2, 'R', 'G')
                    'B' -> bfs(i, j, visited2, graph2, 'B')
                    else -> throw IllegalArgumentException()
                }
            }
        }
    }

    bw.write("$count1 $count2")
    bw.flush()
    bw.close()
    close()
}
