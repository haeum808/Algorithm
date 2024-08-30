import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        if (a == 0 && b == 0) break

        when {
            b % a == 0 -> bw.write("factor\n")
            a % b == 0 -> bw.write("multiple\n")
            else -> bw.write("neither\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
