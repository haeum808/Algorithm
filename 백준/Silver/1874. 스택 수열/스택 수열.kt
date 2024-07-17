import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var currentNumber = 1
    var currentIndex = 0
    val sb = StringBuilder()
    val stack = Stack<Int>()
    val target = List(n) { readLine().toInt() }

    while (true) {
        if (stack.isNotEmpty() && stack.peek() == target[currentIndex]) {
            currentIndex++
            stack.pop()
            sb.append("-\n")
        } else if (currentNumber <= n) {
            stack.push(currentNumber++)
            sb.append("+\n")
        } else {
            break
        }
    }

    if (stack.isEmpty()) {
        bw.write("$sb")
    } else {
        bw.write("NO")
    }
    bw.flush()
    bw.close()
}
