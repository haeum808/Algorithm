import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val queue: Deque<Int> = LinkedList()
    val a = readLine().split(" ").map { it.toInt() }
    val b = readLine().split(" ").map { it.toInt() }
    val m = readLine().toInt()
    val c = readLine().split(" ").map { it.toInt() }

    for (i in a.indices) {
        if (a[i] == 0) {
            queue.offer(b[i])
        }
    }

    for (i in 0..<m) {
        queue.offerFirst(c[i])

        bw.write("${queue.pollLast()} ")
    }

    bw.flush()
    bw.close()
    close()
}
