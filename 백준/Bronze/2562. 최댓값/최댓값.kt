import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = List(9) { readLine().toInt() }

    val maxNumber = numbers.max()
    val maxNumberPosition = numbers.indexOf(maxNumber) + 1

    bw.write("$maxNumber\n$maxNumberPosition")
    bw.flush()
    bw.close()
}