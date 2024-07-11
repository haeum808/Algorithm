import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()
    val result = mutableListOf<Int>()

    for (i in 1..n) {
        queue.offer(i)
    }

    while (!queue.isEmpty()) {
        repeat(k - 1) {
            queue.offer(queue.poll())
        }

        result.add(queue.poll())
    }

    bw.write(result.joinToString(separator = ", ", prefix = "<", postfix = ">"))
    bw.flush()
    bw.close()
}