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

        val r = st.nextToken().toInt()
        val s = st.nextToken()

        s.forEach { char ->
            repeat(r) {
                bw.write("$char")
            }
        }

        bw.write("\n")
    }


    bw.flush()
    bw.close()
}