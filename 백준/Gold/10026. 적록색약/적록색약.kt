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
    val graph1 = Array(n) { CharArray(n) }
    val graph2 = Array(n) { CharArray(n) }
    var count1 = 0
    var count2 = 0

    for (i in 0..<n) {
        val input = readLine()

        for (j in 0..<n) {
            when(input[j]) {
                'R' -> {
                    graph1[i][j] = 'R'
                    graph2[i][j] = 'R'
                }
                'G' -> {
                    graph1[i][j] = 'G'
                    graph2[i][j] = 'R'
                }
                'B' -> {
                    graph1[i][j] = 'B'
                    graph2[i][j] = 'B'
                }
            }
        }
    }

    fun bfs(x: Int, y: Int, graph: Array<CharArray>, vararg condition: Char) {
        val queue: Queue<Point> = LinkedList()
        queue.offer(Point(x, y))
        graph[x][y] = 'X'

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (i in 0..<4) {
                val nx = cx + dx[i]
                val ny = cy + dy[i]

                if (nx in 0..<n && ny in 0..<n && condition.contains(graph[nx][ny])) {
                    graph[nx][ny] = 'X'
                    queue.offer(Point(nx, ny))
                }
            }
        }
    }

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (graph1[i][j] != 'X') {
                count1++
                when (graph1[i][j]) {
                    'R' -> bfs(i, j, graph1, 'R')
                    'G' -> bfs(i, j, graph1, 'G')
                    'B' -> bfs(i, j, graph1, 'B')
                    else -> throw IllegalArgumentException()
                }
            }

            if (graph2[i][j] != 'X') {
                count2++
                when (graph2[i][j]) {
                    'R' -> bfs(i, j, graph2, 'R')
                    'B' -> bfs(i, j, graph2, 'B')
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
