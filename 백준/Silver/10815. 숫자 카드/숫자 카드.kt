import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()
    var st = StringTokenizer(readLine())
    val map = mutableMapOf<Int, Boolean>()

    while (st.hasMoreTokens()) {
        map[st.nextToken().toInt()] = true
    }

    val m = readLine()
    st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        val next = st.nextToken().toInt()

        if (map.containsKey(next)) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }

    bw.flush()
    bw.close()
}