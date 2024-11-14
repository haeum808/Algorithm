import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val stack = Stack<Int>()
    var count = 0L

    for (i in 1..n) {
        val nextHeight = readLine().toInt()

        while (stack.isNotEmpty() && stack.peek() <= nextHeight) {
            stack.pop()
        }

        count += stack.size
        stack.push(nextHeight)
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    close()
}
