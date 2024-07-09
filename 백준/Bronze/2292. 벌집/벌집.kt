import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var current = 1
    var i = 1
    var result = 1

    while (n > current) {
        current += 6 * i++
        result++
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}