import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()
    val points = readLine().split(" ").map { it.toInt() }
    val sortedPoints = points.toSet().sorted()

    points.forEach {
        bw.write("${sortedPoints.binarySearch(it)} ")
    }

    bw.flush()
    bw.close()
}