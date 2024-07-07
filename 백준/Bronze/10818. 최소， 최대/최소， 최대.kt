import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val treeSet = TreeSet<Int>()

    while (st.hasMoreTokens()) {
        treeSet.add(st.nextToken().toInt())
    }

    bw.write("${treeSet.first()} ${treeSet.last()}")

    bw.flush()
    bw.close()
}