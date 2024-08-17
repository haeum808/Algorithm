import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    for (i in 1..n) {
        for (j in n - i downTo 1) {
            bw.write(" ")
        }

        for (j in 1..<i * 2) {
            bw.write("*")
        }
        bw.write("\n")
    }

    for (i in 1..n) {
        for (j in n downTo n - i + 1) {
            bw.write(" ")
        }

        for (j in 1..<(n - i) * 2) {
            bw.write("*")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    close()
}
