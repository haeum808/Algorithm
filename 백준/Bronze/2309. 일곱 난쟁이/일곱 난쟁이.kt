import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val heights = IntArray(9) { readLine().toInt() }.sorted()

    for (i in 8 downTo 0) {
        for (j in i - 1 downTo 0) {
            val height = heights.filter { it != heights[i] && it != heights[j] }

            if (height.sum() == 100) {
                height.forEach {
                    bw.write("$it\n")
                }
                bw.flush()
                bw.close()
                return@with
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
