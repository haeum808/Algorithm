import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val queue: Queue<String> = LinkedList()

    repeat(n) {
        val input = readLine()

        when (input[1]) {
            'u' -> {
                queue.offer(input.split(" ")[1])
            }

            'o' -> {
                if (queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.poll()}\n")
                }
            }

            'i' -> {
                bw.write("${queue.size}\n")
            }

            'm' -> {
                if (queue.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }

            'r' -> {
                if (queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.first()}\n")
                }
            }

            'a' -> {
                if (queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.last()}\n")
                }
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
