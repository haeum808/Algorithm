import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val strings = List<String>(n) { readLine() }

    strings.toSet().sortedWith(compareBy({ it.length }, { it })).forEach {
        bw.write("${it}\n")
    }

    bw.flush()
    bw.close()
}
