import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val numbers = IntArray(100_001)

    val queue: Queue<Int> = LinkedList()
    queue.offer(n)

    while (queue.isNotEmpty()) {
        val next = queue.poll()

        if (next == k) {
            break
        }

        if (next + 1 in 0..100_000 && numbers[next + 1] == 0) {
            queue.offer(next + 1)
            numbers[next + 1] = numbers[next] + 1
        }

        if (next - 1 in 0..100_000 && numbers[next - 1] == 0) {
            queue.offer(next - 1)
            numbers[next - 1] = numbers[next] + 1
        }

        if (next * 2 in 0..100_000 && numbers[next * 2] == 0) {
            queue.offer(next * 2)
            numbers[next * 2] = numbers[next] + 1
        }
    }

    bw.write("${numbers[k]}")
    bw.flush()
    bw.close()
    close()
}
