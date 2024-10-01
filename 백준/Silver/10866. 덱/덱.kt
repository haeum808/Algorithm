import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Deque
import java.util.LinkedList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val deque: Deque<Int> = LinkedList()

    repeat(n) {
        val input = readLine().split(" ")

        when(input[0]) {
            "push_front" -> deque.offerFirst(input[1].toInt())
            "push_back" -> deque.offerLast(input[1].toInt())
            "pop_front" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.pollFirst()}\n")
            "pop_back" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.pollLast()}\n")
            "size" -> bw.write("${deque.size}\n")
            "empty" -> if (deque.isEmpty()) bw.write("1\n") else bw.write("0\n")
            "front" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.peekFirst()}\n")
            "back" -> if (deque.isEmpty()) bw.write("-1\n") else bw.write("${deque.peekLast()}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
