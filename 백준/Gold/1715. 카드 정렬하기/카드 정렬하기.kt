import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val priorityQueue = PriorityQueue<Int>()
    var result = 0

    repeat(n) {
        priorityQueue.offer(readLine().toInt())
    }

    while (priorityQueue.size >= 2) {
        val sum = priorityQueue.poll() + priorityQueue.poll()
        result += sum
        priorityQueue.offer(sum)
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
