import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine()

    bw.write(input.map { if (it.isLowerCase()) it.uppercase() else it.lowercase() }.joinToString(""))
    bw.flush()
    bw.close()
    close()
}
