import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine()

        if (input == ".") break

        val stack = Stack<Char>()

        for (char in input) {
            when (char) {
                '(' -> {
                    stack.push('(')
                }

                '[' -> {
                    stack.push('[')
                }

                ')' -> {
                    if (stack.isNotEmpty() && stack.peek() == '(') {
                        stack.pop()
                    } else {
                        stack.push(')')
                        break
                    }
                }

                ']' -> {
                    if (stack.isNotEmpty() && stack.peek() == '[') {
                        stack.pop()
                    } else {
                        stack.push(']')
                        break
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
    }

    bw.flush()
    bw.close()
}