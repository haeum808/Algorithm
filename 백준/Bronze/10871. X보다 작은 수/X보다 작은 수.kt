import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())
    val n = st.nextToken()
    val x = st.nextToken().toInt()

    val numbers = readLine().split(" ").map { it.toInt() }.filter { it < x }

    numbers.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
}