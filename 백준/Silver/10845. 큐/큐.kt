import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val queue: Queue<Int> = LinkedList()

    repeat(n) {
        val st = StringTokenizer(readLine())

        when (st.nextToken()) {
            "push" -> {
                queue.offer(st.nextToken().toInt())
            }

            "pop" -> {
                if (queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.poll()}\n")
                }
            }

            "size" -> {
                bw.write("${queue.size}\n")
            }

            "empty" -> {
                if (queue.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }

            "front" -> {
                if (queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.peek()}\n")
                }
            }

            "back" -> {
                if (queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.last()}\n")
                }
            }
        }
    }

    bw.flush()
    bw.close()
}
