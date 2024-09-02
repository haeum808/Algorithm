import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    val dx = intArrayOf(-2, -1, 1, 2, -2, -1, 1, 2)
    val dy = intArrayOf(-1, -2, -2, -1, 1, 2, 2, 1)

    repeat(t) {
        val l = readLine().toInt()
        val graph = Array(l) { IntArray(l) }
        val (startX, startY) = readLine().split(" ").map { it.toInt() }
        val (destinationX, destinationY) = readLine().split(" ").map { it.toInt() }

        fun bfs() {
            if (startX == destinationX && startY == destinationY) {
                bw.write("0\n")
                return
            }

            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.offer(startX to startY)
            graph[startX][startY] = 1

            while (queue.isNotEmpty()) {
                val (x, y) = queue.poll()


                for (i in 0..<8) {
                    val nx = x + dx[i]
                    val ny = y + dy[i]

                    if (nx in 0..<l && ny in 0..<l && graph[nx][ny] == 0) {
                        queue.offer(nx to ny)
                        graph[nx][ny] = graph[x][y] + 1

                        if (nx == destinationX && ny == destinationY) {
                            bw.write("${graph[destinationX][destinationY] - 1}\n")
                            break
                        }
                    }
                }
            }
        }

        bfs()
    }

    bw.flush()
    bw.close()
    close()
}
