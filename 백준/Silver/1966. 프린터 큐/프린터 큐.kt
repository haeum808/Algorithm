import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

data class Printer(
    val order: Int,
    val importance: Int,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = readLine().toInt()

    repeat(t) {
        val (n, m) = readLine().split(" ").map { it.toInt() }
        val importance: Queue<Printer> = LinkedList()

        val st = StringTokenizer(readLine())

        var i = 0
        while (st.hasMoreTokens()) {
            val number = st.nextToken().toInt()

            importance.offer(Printer(i++, number))
        }

        var count = 1

        while (true) {
            val max = importance.maxOf { it.importance }
            val top = importance.peek()

            if (top.importance >= max) {
                importance.poll()

                if (top.order == m) {
                    bw.write("$count\n")
                    break
                }
                count++
            } else {
                importance.offer(importance.poll())
            }
        }
    }


    bw.flush()
    bw.close()
}
