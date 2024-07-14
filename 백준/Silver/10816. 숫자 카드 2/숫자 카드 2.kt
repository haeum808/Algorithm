import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val map = mutableMapOf<Int, Int>()
    val n = readLine()
    var st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        val number = st.nextToken().toInt()

        map[number] = map.getOrDefault(number, 0) + 1
    }

    val m = readLine()
    st = StringTokenizer(readLine())

    while (st.hasMoreTokens()) {
        bw.write("${map[st.nextToken().toInt()] ?: 0} ")
    }

    bw.flush()
    bw.close()
}