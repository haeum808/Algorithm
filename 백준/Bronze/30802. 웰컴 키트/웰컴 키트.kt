import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val sizes = readLine().split(" ").map { it.toInt() }
    val (t, p) = readLine().split(" ").map { it.toInt() }

    bw.write("${sizes.sumOf { if(it % t == 0) it / t else if (it - t > 0) it / t + 1 else 1 }}\n")
    bw.write("${n / p} ${n % p}")

    bw.flush()
    bw.close()
}