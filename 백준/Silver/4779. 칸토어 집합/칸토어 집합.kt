import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    fun cantor(str: String): String {
        return str + " ".repeat(str.length) + str
    }

    while (true) {
        val input = readLine() ?: break
        var answer = "-"

        repeat(input.toInt()) {
            answer = cantor(answer)
        }

        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()
    close()
}
