import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val x = readLine().toInt()
    val n = readLine().toInt()
    var sum = 0

    repeat(n) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        sum += a * b
    }

    if (sum == x) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.flush()
    bw.close()
}
