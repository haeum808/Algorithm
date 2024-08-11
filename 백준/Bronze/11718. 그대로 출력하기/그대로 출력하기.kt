import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readlnOrNull() ?: break

        bw.write("${input}\n")
    }

    bw.flush()
    bw.close()
}
