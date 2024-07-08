import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val numbers = readLine().split(" ").map { it.toInt() * it.toInt() }.sorted()

        if (numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0) break

        if (numbers[2] == numbers[0] + numbers[1]) {
            bw.write("right")
        } else {
            bw.write("wrong")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}