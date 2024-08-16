import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = readLine()

    val firstSet = readLine().split(" ").map { it.toInt() }.toSet()
    val secondSet = readLine().split(" ").map { it.toInt() }.toSet()

    bw.write("${firstSet.subtract(secondSet).size + secondSet.subtract(firstSet).size}")
    bw.flush()
    bw.close()
    close()
}