import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val map = Array(n) { readLine().split(" ").toTypedArray() }
    var result = "NO"
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    fun checkAvoid(): Boolean {
        for (i in 0..<n) {
            for (j in 0..<n) {
                if (map[i][j] == "T") {

                    for (k in 0..<4) {
                        var nx = i + dx[k]
                        var ny = j + dy[k]

                        while (nx in 0..<n && ny in 0..<n && map[nx][ny] != "O" && map[nx][ny] != "T") {
                            if (map[nx][ny] == "S") {
                                return false
                            }

                            nx += dx[k]
                            ny += dy[k]
                        }
                    }
                }
            }
        }

        return true
    }

    fun placeThreeWalls(depth: Int) {
        if (depth == 3) {
            val isCanAvoid = checkAvoid()
            if (isCanAvoid) {
                result = "YES"
            }
            return
        }

        for (i in 0..<n) {
            for (j in 0..<n) {
                if (map[i][j] == "X") {
                    map[i][j] = "O"
                    placeThreeWalls(depth + 1)
                    if (result == "YES") break
                    map[i][j] = "X"
                }
            }
        }
    }

    placeThreeWalls(0)

    bw.write(result)
    bw.flush()
    bw.close()
    close()
}
