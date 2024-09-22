import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    bw.write("${fibo(n)}")
    bw.flush()
    bw.close()
    close()
}

fun fibo(n: Int): Int {
    if (n == 1 || n == 2) {
        return 1
    }
    if (n == 0) {
        return 0
    }

    return fibo(n - 1) + fibo(n - 2)
}