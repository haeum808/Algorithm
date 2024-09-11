import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val priorityQueue = PriorityQueue<Int>()

    repeat(n) {
        val input = readLine().toInt()

        if (input == 0) {
            if (priorityQueue.isEmpty()) {
                bw.write("0\n")
            } else {
                bw.write("${priorityQueue.poll()}\n")
            }
        } else {
            priorityQueue.offer(input)
        }
    }

    bw.flush()
    bw.close()
    close()
}
