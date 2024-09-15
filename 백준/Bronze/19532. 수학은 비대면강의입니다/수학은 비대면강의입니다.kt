import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = readLine().split(" ").map { it.toInt() }

    for (x in -999..999) {
        for (y in -999..999) {
            if (numbers[0] * x + numbers[1] * y == numbers[2] &&
                numbers[3] * x + numbers[4] * y == numbers[5]) {
                bw.write("$x $y")
                bw.flush()
                bw.close()
                return@with
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
