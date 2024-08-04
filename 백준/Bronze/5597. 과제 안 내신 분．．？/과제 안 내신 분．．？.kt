import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val numbers = BooleanArray(30)

    repeat(28) {
        numbers[readLine().toInt() - 1] = true
    }

    for (i in 0 ..< 30) {
        if (!numbers[i]) {
            bw.write("${i + 1}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
