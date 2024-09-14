import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val (n, m) = readLine().split(" ").map { it.toInt() }

        bw.write("${combination(n, m)}\n")
    }

    bw.flush()
    bw.close()
    close()
}

fun combination(a: Int, b: Int): Int {
    if (a == b || a == 0) return 1

    var result = 1
    for (i in 1..a) {
        result *= b - a + i
        result /= i
    }
    return result
}