import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b, c) = readLine().split(" ").map { it.toLong() }

    fun recursive(a: Long, b: Long): Long {
        return when {
            b == 1L -> a % c
            b % 2 == 0L -> {
                val answer = recursive(a, b / 2)
                (answer * answer) % c
            }

            else -> {
                val answer = recursive(a, b / 2)
                ((answer * answer % c) * a) % c
            }
        }
    }

    bw.write("${recursive(a, b)}")
    bw.flush()
    bw.close()
    close()
}
