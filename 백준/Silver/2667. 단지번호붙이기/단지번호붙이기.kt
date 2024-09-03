import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val graph = Array(n) { IntArray(n) }
    var totalCount = 0
    val counts = mutableListOf<Int>()
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    for (i in 0..<n) {
        val input = readLine()

        for (j in 0..<n) {
            graph[i][j] = input[j].digitToInt()
        }
    }

    fun bfs(a: Int, b: Int): Int {
        var count = 1
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.offer(a to b)
        graph[a][b] = 0

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()

            for (i in 0..<4) {
                val nx = x + dx[i]
                val ny = y + dy[i]

                if (nx in 0..<n && ny in 0..<n && graph[nx][ny] == 1) {
                    graph[nx][ny] = 0
                    count++
                    queue.offer(nx to ny)
                }
            }
        }

        return count
    }

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (graph[i][j] == 1) {
                totalCount++
                counts.add(bfs(i, j))
            }
        }
    }

    bw.write("$totalCount\n")
    bw.write(counts.sorted().joinToString("\n"))
    bw.flush()
    bw.close()
    close()
}