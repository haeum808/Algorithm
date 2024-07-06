import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val year = readLine().toInt()

    val isLeapYear = if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 1 else 0

    bw.write("$isLeapYear")
    bw.flush()
    bw.close()
}