import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()

    repeat(9) {
        val count = it + 1

        bw.write("$n * $count = ${n * count}\n")
    }

    bw.flush()
    bw.close()
}