import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) { readLine().split(" ").map { it.toInt() }.toIntArray() }

    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    fun isValid(x: Int, y: Int): Boolean {
        return x in 0..<n && y in 0 until m
    }

    fun bfs(startX: Int, startY: Int) {
        queue.offer(startX to startY)
        map[startX][startY] = 2

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (dir in 0..<4) {
                val nx = cx + dx[dir]
                val ny = cy + dy[dir]

                if (isValid(nx, ny) && map[nx][ny] == 1) {
                    queue.offer(nx to ny)
                    map[nx][ny] = map[cx][cy] + 1
                }
            }
        }
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (map[i][j] == 2) {
                bfs(i, j)

                for (row in map) {
                    row.forEach { bw.write("${if (it == 0) 0 else it - 2} ") }
                    bw.newLine()
                }
                bw.flush()
                bw.close()
                close()
                return@with
            }
        }
    }
}
