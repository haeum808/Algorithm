import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine()
    val n = input.toLong()

    for (i in n - input.length * 9 ..< n) {
        if (i + "$i".sumOf { it - '0' } == n) {
            bw.write("$i")
            bw.flush()
            bw.close()
            return
        }
    }

    bw.write("0")
    bw.flush()
    bw.close()
}
