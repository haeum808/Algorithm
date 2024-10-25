import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

data class Time(
    val start: Long,
    val end: Long,
): Comparable<Time> {
    override fun compareTo(other: Time): Int {
        return if (end == other.end) (start - other.start).toInt() else (end - other.end).toInt()
    }
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val times = PriorityQueue<Time>()
    var currentTime = -1L
    var result = 0

    repeat(n) {
        val (start, end) = readLine().split(" ").map { it.toLong() }

        times.offer(Time(start, end))
    }

    while (times.isNotEmpty()) {
        val time = times.poll()

        if (currentTime <= time.start) {
            currentTime = time.end
            result++
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
    close()
}
