import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val input = readLine()

    for (i in input.indices) {
        if (input[i].isLowerCase()) bw.write(input[i].uppercase())
        else bw.write(input[i].lowercase())
    }
    bw.flush()
    bw.close()
    close()
}
