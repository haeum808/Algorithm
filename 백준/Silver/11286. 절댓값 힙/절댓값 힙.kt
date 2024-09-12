import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue
import kotlin.math.abs
import kotlin.math.min

data class Number(
    val value: Int
): Comparable<Number> {
    override fun compareTo(other: Number): Int {
        return if (abs(other.value) == abs(value)) value - other.value else abs(value) - abs(other.value)
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val priorityQueue = PriorityQueue<Number>()

    repeat(n) {
        val input = readLine().toInt()

        if (input == 0) {
            if (priorityQueue.isEmpty()) {
                bw.write("0\n")
            } else {
                bw.write("${priorityQueue.poll().value}\n")
            }
        } else {
            priorityQueue.offer(Number(input))
        }
    }

    bw.flush()
    bw.close()
    close()
}

