import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(readLine())

    val n = st.nextToken().toInt()

    repeat(n) { row ->
        repeat(row + 1) {
            bw.write("*")
        }
        bw.write("\n")
    }
    
    bw.flush()
    bw.close()
}