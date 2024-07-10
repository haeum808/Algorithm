import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toDouble() }
    val maxNumber = numbers.max()

    bw.write("${numbers.map { it / maxNumber * 100 }.average()}\n")
    bw.flush()
    bw.close()
}