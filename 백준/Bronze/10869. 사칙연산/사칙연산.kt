import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    bw.write("${a + b}\n${a - b}\n${a * b}\n${a / b}\n${a % b}")
    bw.flush()
    bw.close()
}