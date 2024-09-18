import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.ArrayDeque
import java.util.Deque
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val deque: ArrayDeque<Pair<Int, Int>> = ArrayDeque()

    for (i in 0..<n) {
        deque.offerLast((i + 1) to numbers[i])
    }

    while (true) {
        val next = deque.pollFirst()

        if (deque.isEmpty()) {
            bw.write("${next.first}")
            break
        }

        if (next.second > 0) {
            repeat(next.second - 1) {
                deque.offerLast(deque.pollFirst())
            }
        } else {
            repeat(next.second * -1) {
                deque.offerFirst(deque.pollLast())
            }
        }

        bw.write("${next.first} ")
    }

    bw.flush()
    bw.close()
    close()
}
