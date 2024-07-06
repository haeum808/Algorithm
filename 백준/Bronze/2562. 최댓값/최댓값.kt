import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var maxNumber = 0
    var maxNumberPosition = 0

    (1..9).forEach {
        val number = readLine().toInt()

        if (maxNumber < number) {
            maxNumber = number
            maxNumberPosition = it
        }
    }

    bw.write("$maxNumber\n$maxNumberPosition")
    bw.flush()
    bw.close()
}