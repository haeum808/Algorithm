import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        var c = readLine().toInt()

        bw.write("${c / 25} ")
        c %= 25
        bw.write("${c / 10} ")
        c %= 10
        bw.write("${c / 5} ")
        c %= 5
        bw.write("$c\n")
    }

    bw.flush()
    bw.close()
    close()
}
