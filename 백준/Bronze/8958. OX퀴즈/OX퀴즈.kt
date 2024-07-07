import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        var count = 0
        var temp = 0
        val result = readLine()

        for (i in result.indices) {
            if (result[i] == 'O') {
                temp++
                count += temp
            } else {
                temp = 0
            }
        }

        bw.write("$count\n")
    }

    bw.flush()
    bw.close()
}