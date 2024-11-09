import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val str = readLine()
    val target = readLine()
    val stack = Stack<Char>()

    for (char in str) {
        stack.push(char)

        if (stack.size >= target.length) {
            var count = 0

            for (i in target.length - 1 downTo 0) {
                if (stack[stack.lastIndex - i] == target[target.length - 1 - i]) count++
                else break
            }

            if (count == target.length) {
                repeat(count) {
                    stack.pop()
                }
            }
        }
    }

    if (stack.size == 0) {
        bw.write("FRULA")
    } else {
        bw.write(stack.joinToString(""))
    }

    bw.flush()
    bw.close()
    close()
}
