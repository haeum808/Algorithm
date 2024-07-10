import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()
    val apart = Array(15) { IntArray(15) }

    for (i in 1..14) {
        apart[0][i] = i
        apart[i][1] = 1
    }

    for (i in 1..14) {
        for (j in 1..14) {
            apart[i][j] = (1..j).sumOf { apart[i- 1][it] }
        }
    }

    repeat(t) {
        val k = readLine().toInt()
        val n = readLine().toInt()

        bw.write("${apart[k][n]}\n")
    }

    bw.flush()
    bw.close()
}
