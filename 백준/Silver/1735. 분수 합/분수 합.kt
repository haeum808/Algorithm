import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a1, b1) = readLine().split(" ").map { it.toInt() }
    val (a2, b2) = readLine().split(" ").map { it.toInt() }

    val result1 = (a1 * b2) + (a2 * b1)
    val result2 = b1 * b2

    val gca = gca(result1, result2)

    bw.write("${result1 / gca} ${result2/ gca}")
    bw.flush()
    bw.close()
    close()
}

fun gca(a: Int, b: Int): Int {
    if (a % b == 0) {
        return b
    }

    return gca(b, a % b)
}