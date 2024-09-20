import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val fibo = IntArray(1_000_001)
    fibo[1] = 1
    fibo[2] = 2
    fibo[3] = 3

    for (i in 4..n) {
        fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 15746
    }

    bw.write("${fibo[n]}")
    bw.flush()
    bw.close()
    close()
}
