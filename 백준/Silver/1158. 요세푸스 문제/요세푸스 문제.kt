import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Deque
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n, k) = readLine().split(" ").map { it.toInt()}
    val deque: Deque<Int> = LinkedList()
    val numbers = mutableListOf<Int>()

    repeat(n) {
        deque.offerLast(it + 1)
    }

    while (deque.isNotEmpty()) {

        repeat(k - 1) {
            deque.offerLast(deque.pollFirst())
        }

        numbers.add(deque.pollFirst())
    }

    bw.write("<${numbers.joinToString(", ")}>")
    bw.flush()
    bw.close()
    close()
}
