import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val deque: Deque<String> = LinkedList()

    repeat(n) {
        val input = readLine()

        when (input[0]) {
            '1' -> {
                deque.offerFirst(input.split(" ")[1])
            }

            '2' -> {
                deque.offerLast(input.split(" ")[1])
            }

            '3' -> {
                if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.pollFirst()}\n")
            }

            '4' -> {
                if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.pollLast()}\n")
            }

            '5' -> {
                bw.write("${deque.size}\n")
            }

            '6' -> {
                if (deque.isEmpty()) bw.write("1\n") else bw.write("0\n")
            }

            '7' -> {
                if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.peekFirst()}\n")
            }

            '8' -> {
                if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.peekLast()}\n")
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
