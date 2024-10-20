import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { readLine().split(" ").map { it.toInt() }.toTypedArray() }
    var result = 0
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    fun dfs() {
        var count = 0
        val originalZeroes = mutableListOf<Pair<Int, Int>>()

        for (i in 0..<n) {
            for (j in 0..<m) {
                if (graph[i][j] == 2) {
                    val queue: Queue<Pair<Int, Int>> = LinkedList()
                    queue.offer(i to j)

                    while (queue.isNotEmpty()) {
                        val next = queue.poll()

                        for (k in 0..<4) {
                            val nx = next.first + dx[k]
                            val ny = next.second + dy[k]

                            if (nx in 0..<n && ny in 0..<m && graph[nx][ny] == 0) {
                                graph[nx][ny] = 2
                                queue.offer(nx to ny)
                                originalZeroes.add(nx to ny)
                            }
                        }
                    }
                }
            }
        }

        for (i in 0..<n) {
            for (j in 0..<m) {
                if (graph[i][j] == 0) {
                    count++
                }
            }
        }

        result = maxOf(result, count)

        originalZeroes.forEach {
            graph[it.first][it.second] = 0
        }
    }

    fun findThree(x: Int, y: Int, depth: Int) {
        if (depth == 3) {
            graph[x][y] = 1
            dfs()
            graph[x][y] = 0
            return
        }

        for (i in 0..<n) {
            for (j in 0..<m) {
                if (graph[i][j] == 0) {
                    graph[i][j] = 1
                    findThree(i, j, depth + 1)
                    graph[i][j] = 0
                }
            }
        }
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (graph[i][j] == 0) {
                graph[i][j] = 1
                findThree(i, j, 1)
                graph[i][j] = 0
            }
        }
    }
    
    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
