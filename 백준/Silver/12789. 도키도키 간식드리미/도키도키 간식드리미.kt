import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val numbers = readLine().split(" ").map { it.toInt() }
    val stack1 = Stack<Int>()
    val stack2 = Stack<Int>()
    var current = 1

    for (i in n - 1 downTo 0) {
        stack1.push(numbers[i])
    }

    while (true) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            bw.write("Nice")
            break
        }

        if (stack2.isNotEmpty() && stack2.peek() == current) {
            current++
            stack2.pop()
        } else if (stack1.isEmpty() && stack2.isNotEmpty() && stack2.peek() != current) {
            bw.write("Sad")
            break
        } else if (stack1.isNotEmpty() && stack1.peek() == current) {
            current++
            stack1.pop()
        } else if (stack1.isNotEmpty()) {
            stack2.push(stack1.pop())
        }
    }

    bw.flush()
    bw.close()
    close()
}
