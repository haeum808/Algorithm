import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val queue: Queue<Int> = LinkedList()
    val n = readLine().toInt()

    repeat(n) {
        queue.offer(it + 1)
    }

    while (queue.size != 1) {
        queue.poll()
        queue.offer(queue.poll())
    }

    bw.write("${queue.peek()}")
    bw.flush()
    bw.close()
}