import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    repeat(n) {
        val input = readLine()
        val stack = Stack<Char>()

        for (char in input) {
            if (char == '(') {
                stack.push('(')
            } else if (char == ')') {
                if (stack.isNotEmpty() && stack.peek() == '(') {
                    stack.pop()
                } else {
                    stack.push(')')
                    break
                }
            }
        }

        if (stack.isEmpty()) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.flush()
    bw.close()
}