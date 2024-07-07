import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val st = StringTokenizer(readLine())
        bw.write("${st.nextToken().toInt() + st.nextToken().toInt()}\n")
    }

    bw.flush()
    bw.close()
}