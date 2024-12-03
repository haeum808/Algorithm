import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a, b) = readLine().split(" ").map { it.toLong() }
    var result = 0
    val queue: Queue<Long> = LinkedList()
    queue.offer(a)

    while (queue.isNotEmpty()) {
        result++

        repeat(queue.size) {
            val next = queue.poll()

            if (next * 2 < b) {
                queue.offer(next * 2)
            }
            if ((next * 10) + 1 < b) {
                queue.offer((next * 10) + 1)
            }

            if (next * 2 == b) {
                bw.write("${result + 1}")
                bw.flush()
                bw.close()
                return@with
            }
            if ((next * 10) + 1 == b) {
                bw.write("${result + 1}")
                bw.flush()
                bw.close()
                return@with
            }
        }
    }

    bw.write("-1")
    bw.flush()
    bw.close()
    close()
}
