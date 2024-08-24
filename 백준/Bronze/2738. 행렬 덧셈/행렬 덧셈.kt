import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }

    val arr1 = Array(n) { readLine().split(" ").map { it.toInt() } }
    val arr2 = Array(n) { readLine().split(" ").map { it.toInt() } }

    for (i in 0 ..< n) {
        for (j in 0 ..< m) {
            bw.write("${arr1[i][j] + arr2[i][j]} ")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    close()
}
