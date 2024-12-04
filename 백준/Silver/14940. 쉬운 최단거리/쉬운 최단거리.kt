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

    fun bfs(i: Int, j: Int) {
        queue.offer(i to j)

        while (queue.isNotEmpty()) {
            val (cx, cy) = queue.poll()

            for (position in 0..<4) {
                val nx = cx + dx[position]
                val ny = cy + dy[position]

                if (nx in 0..<n && ny in 0..<m) {
                    if (map[nx][ny] == 1) {
                        queue.offer(nx to ny)
                        map[nx][ny] = map[cx][cy] + 1
                    }
                }
            }
        }
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (map[i][j] == 2) {
                bfs(i, j)

                for (k in 0..<n) {
                    for (l in 0..<m) {
                        if (map[k][l] != 0) {
                            bw.write("${map[k][l] - 2} ")
                        } else {
                            bw.write("0 ")
                        }
                    }
                    bw.write("\n")
                }

                bw.flush()
                bw.close()
                close()
                return@with
            }
        }
    }
}
