import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    var balls = List(n) { it + 1 }

    repeat(m) {
        val (i, j) = readLine().split(" ").map { it.toInt() - 1 }

        balls = balls.slice(0..<i) + balls.slice(i..j).reversed() + balls.slice(j + 1..<n)
    }

    balls.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()
}
