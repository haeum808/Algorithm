import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val result = IntArray(n)
    val lines  = readLine().split(" ").map { it.toInt() }

    var num = 1
    for (line in lines) {
        var curLine = line
        var index = 0

        while (curLine != 0 || result[index] != 0) {
            if (result[index] == 0) {
                curLine--
            }
            index++
        }

        result[index] = num++
    }

    bw.write(result.joinToString(" "))
    bw.flush()
    bw.close()
    close()
}
