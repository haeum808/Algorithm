import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val lines = readLine().split(" ").map { it.toInt() }.sorted()
    var result = 0
    var temp = 0

    for (i in lines.indices) {
        temp += lines[i]
        result += temp
    }
    
    bw.write("$result")
    bw.flush()
    bw.close()
}
