import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = mutableSetOf<Int>()

    repeat(10) {
        numbers.add(readLine().toInt() % 42)
    }

    bw.write("${numbers.size}")
    bw.flush()
    bw.close()
}