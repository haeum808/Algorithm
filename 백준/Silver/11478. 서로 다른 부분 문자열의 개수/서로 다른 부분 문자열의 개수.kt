import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine()
    val set = HashSet<String>()
    var index = 0
    
    repeat(input.length) {
        for (i in input.indices) {
            if (i + index + 1 <= input.length) {
                set.add(input.substring(i, i + index + 1))
            }
        }

        index++
    }

    bw.write("${set.size}")
    bw.flush()
    bw.close()
    close()
}
