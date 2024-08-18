import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var max = -1
    var iIndex = 0
    var jIndex = 0
    val numbers = Array(9) { readLine().split(" ").map { it.toInt() } }

    for (i in 0..<9) {
        for (j in 0..<9) {
            if (max < numbers[i][j]) {
                max = numbers[i][j]
                iIndex = i + 1
                jIndex = j + 1
            }
        }
    }

    bw.write("$max\n")
    bw.write("$iIndex $jIndex")
    bw.flush()
    bw.close()
    close()
}
