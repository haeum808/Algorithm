import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var sum = 0.0
    var total = 0.0

    repeat(20) {
        val input = readLine().split(" ")

        when(input[2]) {
            "A+" -> {
                total += 4.5 * input[1].toDouble()
            }
            "A0" -> {
                total += 4.0 * input[1].toDouble()
            }
            "B+" -> {
                total += 3.5 * input[1].toDouble()
            }
            "B0" -> {
                total += 3.0 * input[1].toDouble()
            }
            "C+" -> {
                total += 2.5 * input[1].toDouble()
            }
            "C0" -> {
                total += 2.0 * input[1].toDouble()
            }
            "D+" -> {
                total += 1.5 * input[1].toDouble()
            }
            "D0" -> {
                total += 1.0 * input[1].toDouble()
            }
            "F" -> {
                total += 0.0 * input[1].toDouble()
            }
            "P" -> {
                sum -= input[1].toDouble()
            }
        }

        sum += input[1].toDouble()
    }

    bw.write("${total / sum}")
    bw.flush()
    bw.close()
    close()
}