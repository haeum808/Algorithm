import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine() ?: break

        if (input.isEmpty() || input.isBlank()) {
            break
        } else {
            bw.write("${input[0].digitToInt() + input[2].digitToInt()}\n")
        }
    }

    bw.flush()
    bw.close()
}