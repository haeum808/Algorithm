import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numbers = IntArray(20_000_001)
    val n = readLine()
    var st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        numbers[st.nextToken().toInt() + 10_000_000] += 1
    }

    val m = readLine()
    st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        bw.write("${numbers[st.nextToken().toInt() + 10_000_000]} ")
    }

    bw.flush()
    bw.close()
}