import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val x = mutableListOf<Int>()
    val y = mutableListOf<Int>()

    repeat(3) {
        val (a, b) = readLine().split(" ").map { it.toInt() }

        x.add(a)
        y.add(b)
    }

    x.sort()
    y.sort()

    if (x[0] == x[1]) {
        bw.write("${x[2]} ")
    } else {
        bw.write("${x[0]} ")
    }

    if (y[0] == y[1]) {
        bw.write("${y[2]}")
    } else {
        bw.write("${y[0]}")
    }

    bw.flush()
    bw.close()
    close()
}
