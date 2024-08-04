import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val c = readLine().toInt()

    val sum = (a * 60 + b + c)
    var hour = sum / 60
    val minute = sum % 60

    if (hour >= 24) hour -= 24

    bw.write("$hour $minute")
    bw.flush()
    bw.close()
}
