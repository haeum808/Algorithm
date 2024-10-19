import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val dx = intArrayOf(1, -1, 0, 0, -1, 1, 1, -1)
    val dy = intArrayOf(0, 0, 1, -1, -1, 1, -1, 1)

    while (true) {
        val (w, h) = readLine().split(" ").map { it.toInt() }

        if (w == 0 && h == 0) break

        var count = 0
        val graph = Array(h) { readLine().split(" ").map { it.toInt() }.toTypedArray() }

        fun dfs(x: Int, y: Int) {
            graph[x][y] = 0

            for (i in 0..<8) {
                val nx = x + dx[i]
                val ny = y + dy[i]

                if (nx in 0..<h && ny in 0..<w && graph[nx][ny] == 1) {
                    dfs(nx, ny)
                }
            }
        }

        for (i in 0..<h) {
            for (j in 0..<w) {
                if (graph[i][j] == 1) {
                    dfs(i, j)
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
