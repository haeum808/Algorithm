import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val balls = IntArray(n) { it + 1 }
    val temp = IntArray(n)

    repeat(m) {
        val (i, j) = readLine().split(" ").map { it.toInt() - 1 }

        if (i != j) {
            for (k in i..j) {
                temp[k] = balls[k]
            }

            var cnt = 0
            for (k in i..j) {
                balls[k] = temp[j - cnt++]
            }
        }
    }

    balls.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()
}
